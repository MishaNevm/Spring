package org.example.ls21.dao;

import org.example.ls21.models.People;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleDAO {

    private final List<People> peopleList;
    private static int PEOPLE_COUNTER = 0;

    {

        peopleList = new ArrayList<>(List.of(
                new People(++PEOPLE_COUNTER, "Misha"),
                new People(++PEOPLE_COUNTER, "Anya"),
                new People(++PEOPLE_COUNTER, "Sasha"),
                new People(++PEOPLE_COUNTER, "Nikol")
        ));
    }

    public List<People> getPeoples() {
        return peopleList;
    }

    public void addPerson(People people) {
        people.setId(++PEOPLE_COUNTER);
        peopleList.add(people);
    }

    public People getPerson(int id) {
        return peopleList.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public void edit(int id, People person) {
        peopleList.get(id - 1).setName(person.getName());
    }

    public void delete(int id) {
        peopleList.removeIf(a -> a.getId() == id);
    }
}
