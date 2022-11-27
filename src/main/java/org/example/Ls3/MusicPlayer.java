package org.example.Ls3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
    private final List<Music> music;
    @Value("${MusicPlayer.volume}")
    private int volume;
    @Value("${MusicPlayer.name}")
    private String name;

    @Autowired
    public MusicPlayer(Music ... musics) {
        music = new ArrayList<>(Arrays.asList(musics));
    }
    @PostConstruct
    public void initMethod () {
        System.out.println("Music player created");
    }
    @PreDestroy
    public void destroyMethod () {
        System.out.println("Music player destroyed");
    }
    public void playSongs () {
        System.out.println(name);
        System.out.println(volume);
        music.forEach(System.out::println);
    }
}
