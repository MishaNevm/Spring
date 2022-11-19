package org.example.Pr2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = new MusicPlayer(context.getBean("musicBean",Music.class));
        musicPlayer.playSong();
        context.close();
    }
}
