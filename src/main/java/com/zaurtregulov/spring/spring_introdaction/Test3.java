package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet",Pet.class);
        //Pet pet = new Dog();
        Person person = context.getBean("myPerson",Person.class);
        person.CollYourPet();

        context.close();
    }

}
