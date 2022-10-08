package com.zaurtregulov.spring.spring_introdaction;

public class Person {
    private Pet pet;
    private String surName;
    private int age;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }
    public Person(){
        System.out.println("bean is created");
    }

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

    public void setPet(Pet pet) {
        System.out.println("class Person: set Pet");
        this.pet = pet;
    }

    public void CollYourPet(){
        System.out.println("hello, my lovely pet");
        pet.sey();
    }

}
