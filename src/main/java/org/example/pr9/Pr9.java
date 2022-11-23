package org.example.pr9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Pr9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<RapMusic> rapMusicList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rapMusicList.add(context.getBean("rapBean", RapMusic.class));
            System.out.println(rapMusicList.get(i));
        }
        context.close();
    }
}
