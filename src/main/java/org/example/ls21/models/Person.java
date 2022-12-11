package org.example.ls21.models;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "name should be not empty")
    @Size(min = 2, max = 30, message = "q")
    private String name;

    public Person() {
        id = 0;
        name = null;
    }

    public Person(int id, String name) {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
