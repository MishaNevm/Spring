package org.example.pr5;

import org.example.pr5.MusicTypes.Music;

import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList;

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

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        if (musicList.isEmpty()) {
            System.out.println("Play list is empty");
            musicList.forEach(a -> System.out.println(a.getSong()));
        } else {
            System.out.println(name);
            System.out.println(volume);
            musicList.forEach(a -> System.out.println(a.getSong()));
        }
    }

}
