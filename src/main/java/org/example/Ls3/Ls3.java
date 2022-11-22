package org.example.Ls3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ls3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music1 = context.getBean("musicBean",Music.class);
        System.out.println(music1.getSong());
        context.close();
    }
}
