package org.example.pr12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
    private final int id;
    private static int ids;
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;
    ClassicMusic classicMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic) {
        this.classicMusic = classicMusic;
        id = ++ids;
    }

    public void play() {
        System.out.println(name + id);
        System.out.println(volume);
        System.out.println(classicMusic.getSong());
    }
}
