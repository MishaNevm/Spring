package org.example.ls10;

import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
    private final Music[] musics;
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;

    public MusicPlayer(Music... musics) {
        this.musics = musics;
    }

    public void playMusic() {
        System.out.println(name);
        System.out.println(volume + "\n");
        for (Music music : musics) {
            for (String song : music.getSongs()) {
                System.out.println(song);
            }
            System.out.println();
        }
    }
}
