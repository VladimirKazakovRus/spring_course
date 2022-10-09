package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.CollYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurName());
//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.sey();

        context.close();
    }
}
