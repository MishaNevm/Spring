package org.example.pr9;

public class RapMusic {
    String name;
    int id;
    private static int ids = 0;
    private RapMusic(int id) {
        this.id = id;
    }
    public static RapMusic create() {
        return new RapMusic(++ids);
    }
    public void initMethod () {
        System.out.println("Object " + id + " create");
    }
    public void destroyMethod () {
        System.out.println("Object " + id + " destroyed");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + ", id=" + id;
    }
}
