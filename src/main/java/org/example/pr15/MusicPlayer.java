package org.example.pr15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music[] musics;
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(Music... musics) {
        this.musics = musics;
    }

    public void playSongs() {
        System.out.println(name);
        System.out.println(volume + "\n");
        for (Music s : musics) System.out.println(s.getSong());
    }
}
