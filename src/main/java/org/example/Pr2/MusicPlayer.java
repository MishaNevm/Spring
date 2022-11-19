package org.example.Pr2;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playSong () {
        System.out.println(music.getSong());
    }
}
