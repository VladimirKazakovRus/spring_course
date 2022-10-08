package com.zaurtregulov.spring.spring_introdaction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void CollYourPet(){
        System.out.println("hello, my lovely pet");
        pet.sey();
    }

}
