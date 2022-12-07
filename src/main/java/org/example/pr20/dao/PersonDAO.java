package org.example.pr20.dao;


import org.example.pr20.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PERSON_COUNT = 0;
    private final List<Person> personList;

    {
        personList = new ArrayList<>(List.of(
                new Person(++PERSON_COUNT, "Misha"),
                new Person(++PERSON_COUNT, "Anna"),
                new Person(++PERSON_COUNT, "Nikita"),
                new Person(++PERSON_COUNT, "Koke")
        ));
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Person getPerson(int id) {
        return personList.get(id - 1);
    }

    public void addPerson(Person person) {
        person.setId(++PERSON_COUNT);
        personList.add(person);
    }

}
