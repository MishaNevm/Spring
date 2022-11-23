package org.example.Ls3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ls3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music1 = context.getBean("rapMusic",Music.class);
        Music music2 = context.getBean("classicMusic",Music.class);
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());
        context.close();
    }
}
