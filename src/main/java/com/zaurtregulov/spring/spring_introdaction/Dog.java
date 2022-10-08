package com.zaurtregulov.spring.spring_introdaction;

public class Dog implements Pet{
    private String name;
    public Dog(){
        System.out.println("bean Dog is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sey(){
        System.out.println("Bow-wow");
    }
}
