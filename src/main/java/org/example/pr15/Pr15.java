package org.example.pr15;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pr15 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean("musicPlayer", MusicPlayer.class).playSongs();
        context.close();
    }
}
