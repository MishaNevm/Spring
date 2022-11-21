package org.example.pr5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pr5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("musicPlayerBean", MusicPlayer.class).playMusic();
        context.close();
    }
}
