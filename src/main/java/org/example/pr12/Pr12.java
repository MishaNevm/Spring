package org.example.pr12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pr12 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("musicPlayer", MusicPlayer.class).play();
        context.getBean("musicPlayer", MusicPlayer.class).play();
        context.getBean("musicPlayer", MusicPlayer.class).play();
        context.close();
    }
}
