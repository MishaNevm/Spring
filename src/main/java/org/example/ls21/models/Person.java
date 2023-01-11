package org.example.ls21.models;



public class Person {
    private int id;
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
