package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.sey();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.sey();


        context.close();


    }
}
