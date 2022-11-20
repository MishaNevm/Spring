package org.example.Pr2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("musicPlayerBean", MusicPlayer.class ).playSong();
        context.close();
    }
}
