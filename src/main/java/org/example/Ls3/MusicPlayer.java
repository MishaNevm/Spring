package org.example.Ls3;

public class MusicPlayer {
    private Music music;
    private int volume;
    private String name;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println(music.getSong());
    }
}
