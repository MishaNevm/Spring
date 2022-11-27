package org.example.ls10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ls10 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean("musicPlayer", MusicPlayer.class).playMusic();
        context.close();
    }
}
