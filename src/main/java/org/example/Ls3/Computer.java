package org.example.Ls3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private static int ids = 0;
    MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        id = ++ids;
    }
    public void work () {
        System.out.println(id + "\n");
        musicPlayer.playSongs();
    }
}
