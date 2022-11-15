package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем бины (объекты классов из xml файла

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // достаем объект, указав id бина который нам нужен и объект какого класса нам нужно достать

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        // после каждого использования контекст нужно закрывать

        context.close();
    }
}
