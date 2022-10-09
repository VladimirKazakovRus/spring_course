package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surName;
    private int age;
//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("person bean is created");
//        this.pet = pet;
//    }
//    public Person(){
//        System.out.println("bean is created");
//    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("class Person: set Pet");
        this.pet = pet;
    }

    public void CollYourPet(){
        System.out.println("hello, my lovely pet");
        pet.sey();
    }

}
