package org.example.Ls3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MusicPlayer {

    private final Map<MusicTypes, Music> musicList;
    Random random;

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music classicMusic, @Qualifier("rapMusic") Music rapMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        musicList = new HashMap<>();
        random = new Random();
        musicList.put(MusicTypes.RAP, rapMusic);
        musicList.put(MusicTypes.CLASSICAL, classicMusic);
        musicList.put(MusicTypes.ROCK, rockMusic);
    }
    public void playRandomSong (MusicTypes mp) {
        String [] songs = musicList.get(mp).getSong();
        System.out.println(songs[random.nextInt(songs.length)]);
    }
}
