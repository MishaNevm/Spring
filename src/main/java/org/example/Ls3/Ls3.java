package org.example.Ls3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ls3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer1.setVolume(50);
        musicPlayer2.setVolume(100);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
        context.close();
    }
}
