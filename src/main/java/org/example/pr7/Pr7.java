package org.example.pr7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Pr7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<RapMusic> rapMusicList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rapMusicList.add(context.getBean("musicBean", RapMusic.class));
            System.out.println(rapMusicList.get(i).getId());
        }
        context.close();
    }
}
