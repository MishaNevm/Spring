package org.example.pr4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pr4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.play();
        context.close();
    }
}
