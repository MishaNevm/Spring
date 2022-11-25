package org.example.pr11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pr11 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("computer", Computer.class).playSong(MusicTypes.RAP);
        context.close();
    }
}
