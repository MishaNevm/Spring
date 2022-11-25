package org.example.pr11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component
public class MusicPlayer {
    private final Map<MusicTypes, Music> musicMap;

    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music rapMusic, @Qualifier("rockMusic") Music rockMusic) {
        musicMap = new HashMap<>();
        musicMap.put(MusicTypes.RAP, rapMusic);
        musicMap.put(MusicTypes.ROCK, rockMusic);
    }

    public void playRandomSong(MusicTypes musicTypes) {
        Random random = new Random();
        Music music = musicMap.get(musicTypes);
        System.out.println(music.getSong()[random.nextInt(music.getSong().length)]);
    }
}
