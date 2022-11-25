package org.example.pr11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    MusicPlayer musicPlayer;
    private final int id;
    private static int ids = 0;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        id = ++ids;
    }

    public void playSong(MusicTypes musicTypes) {
        System.out.println(id);
        musicPlayer.playRandomSong(musicTypes);
    }
}
