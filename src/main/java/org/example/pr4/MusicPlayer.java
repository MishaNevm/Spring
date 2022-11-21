package org.example.pr4;

import org.example.pr4.MusicTypes.Music;

import java.util.Set;

public class MusicPlayer {
    private Set<Music> musicList;
    private String playListName;
    private int volume;

    public Set<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(Set<Music> musicList) {
        this.musicList = musicList;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Set<Music> musicList, String playListName, int volume) {
        this.musicList = musicList;
        this.playListName = playListName;
        this.volume = volume;
    }
    public void play () {
        if (musicList.isEmpty()) {
            System.out.println("Play list is empty");
        } else {
            System.out.println(playListName);
            System.out.println(volume);
            musicList.forEach(a -> System.out.println(a.getSong()));
        }
    }
}
