package org.example.ls18.dao;

import org.example.ls18.models.People;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleDAO {

    private final List<People> peopleList;

    {
        int PEOPLE_COUNT = 0;
        peopleList = new ArrayList<>(List.of(
                new People(++PEOPLE_COUNT, "Misha"),
                new People(++PEOPLE_COUNT, "Anya"),
                new People(++PEOPLE_COUNT, "Nikita"),
                new People(++PEOPLE_COUNT, "Sasha"),
                new People(++PEOPLE_COUNT, "Nikol")
        ));
    }


    public List<People> getPersons() {
        return peopleList;
    }

    public People getPerson(int id) {
        return peopleList.get(id - 1);
    }

}
