package org.example.ls2;

public class MusicPlayer {
    Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void play () {
        System.out.println(music.playMusic());
    }
}
