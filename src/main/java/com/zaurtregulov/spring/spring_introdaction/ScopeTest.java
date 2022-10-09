package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);

        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println(myDog == yourDog);

        context.close();
    }
}
