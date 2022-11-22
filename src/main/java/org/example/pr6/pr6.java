package org.example.pr6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pr6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer mp1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(mp1 == mp2);
        context.close();
    }
}
