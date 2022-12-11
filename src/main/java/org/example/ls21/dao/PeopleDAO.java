package org.example.ls21.dao;

import org.example.ls21.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleDAO {

    private final List<Person> personList;
    private static int PEOPLE_COUNTER = 0;

    {

        personList = new ArrayList<>(List.of(
                new Person(++PEOPLE_COUNTER, "Misha"),
                new Person(++PEOPLE_COUNTER, "Anya"),
                new Person(++PEOPLE_COUNTER, "Sasha"),
                new Person(++PEOPLE_COUNTER, "Nikol")
        ));
    }

    public List<Person> getPeoples() {
        return personList;
    }

    public void addPerson(Person person) {
        person.setId(++PEOPLE_COUNTER);
        personList.add(person);
    }

    public Person getPerson(int id) {
        return personList.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public void edit(int id, Person person) {
        personList.get(id - 1).setName(person.getName());
    }

    public void delete(int id) {
        personList.removeIf(a -> a.getId() == id);
    }
}
