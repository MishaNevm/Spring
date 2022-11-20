package org.example.Ls3;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic () {
        System.out.println(music.getSong());
    }
}
