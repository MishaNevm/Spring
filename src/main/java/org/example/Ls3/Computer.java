package org.example.Ls3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private static int ids = 0;
    private final MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        id = ++ids;
        this.musicPlayer = musicPlayer;
        musicPlayer.playRandomSong(MusicTypes.RAP);
    }

    public int getId() {
        return id;
    }
}
