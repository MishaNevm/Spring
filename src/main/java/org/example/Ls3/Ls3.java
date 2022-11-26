package org.example.Ls3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ls3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer1 = context.getBean("computer", Computer.class);
        Computer computer2 = context.getBean("computer", Computer.class);
        System.out.println(computer1 == computer2);
        context.close();
    }
}
