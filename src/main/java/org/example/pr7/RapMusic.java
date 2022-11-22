package org.example.pr7;

public class RapMusic {
    private String name;
    private int id;
    private static int ids = 1;

    public String getMusic() {
        return "Yo yo yo it's a rapchik";
    }
    public void initMethod () {
        id = ids;
        ids++;
        System.out.println("Object " + id + " create");
    }
    public void destroyMethod () {
        System.out.println("Спасибо за прослушивание");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
