package org.example.ls2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ls2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        new MusicPlayer(context.getBean("musicBean",Music.class)).play();
        context.close();
    }
}
