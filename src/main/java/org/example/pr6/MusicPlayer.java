package org.example.pr6;

import org.example.pr6.musicTypes.Music;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> music, String name, int volume) {
        this.music = music;
        this.name = name;
        this.volume = volume;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void playMusic () {
        if (music.isEmpty()){
            System.out.println("Play list is empty");
        } else {
            System.out.println(name);
            System.out.println(volume);
            music.forEach(a -> System.out.println(a.song()));
        }
    }
}
