package com.zaurtregulov.spring.spring_introdaction;

public class Test3 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.CollYourPet();
    }

}
