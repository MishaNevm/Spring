package org.example.pr7;

public class RapMusic {
    private String name;
    private final int id;
    private static int ids = 1;

    private RapMusic(int id) {
        this.id = id;
    }

    public static RapMusic create() {
        return new RapMusic(ids++);
    }

    public void initMethod() {
        System.out.println("Object " + id + " create");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
