package org.example.Ls3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pr13 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("musicPlayer",MusicPlayer.class).playSongs();
        context.close();
    }
}
