package org.example.Ls3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MusicPlayer {

    private final String name;
    private int volume;
    private final Map<MusicTypes, Music> musicMap;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicMusic") Music classicMusic,
                       @Qualifier("rapMusic") Music rapMusic,
                       @Value("${MusicPlayer.name}") String name,@Value("${MusicPlayer.volume}") int volume) {
        musicMap = new HashMap<>();
        this.name = name;
        this.volume = volume;
        musicMap.put(MusicTypes.RAP, rapMusic);
        musicMap.put(MusicTypes.ROCK, rockMusic);
        musicMap.put(MusicTypes.CLASSIC, classicMusic);
    }
    public void initMethod() {
        System.out.println("Music player create");
    }
    public void playSongs() {
        System.out.println(name);
        System.out.println(volume + "\n");
        musicMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value.getSong());
            System.out.println();
        });
    }
}
