package org.example.Pr2;

import java.util.List;

public class MusicPlayer {
    int volume;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    List<Music> list;

    public void setList(List<Music> list) {
        this.list = list;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playSong() {
        if (list.isEmpty()) {
            System.out.println("Music list is empty");
        } else {
            System.out.println("play list name: " + name);
            System.out.println("volume " + volume);
            list.forEach(a -> System.out.println(a.getSong()));
        }

    }
}
