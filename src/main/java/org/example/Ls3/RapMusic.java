package org.example.Ls3;

public class RapMusic implements Music{
    private RapMusic() {}
    @Override
    public String getSong() {
        return "Yoyoyo it's a RAPchik";
    }

    public void doMyInit () {
        System.out.println("Object created");
    }
    public void doMyDestroy () {
        System.out.println("Object destory");
    }
    public static RapMusic createRapMusic() {
        return new RapMusic();
    }
}
