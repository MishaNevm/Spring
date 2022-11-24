package org.example.Ls3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ls8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer",Computer.class);
        context.close();
    }
}
