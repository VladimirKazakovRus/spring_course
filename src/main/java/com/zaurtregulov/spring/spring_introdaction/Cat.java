package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.stereotype.Component;

import javax.swing.*;
@Component("catBean")
public class Cat implements Pet {
    public Cat(){
        System.out.println("Cat created");
    }
    @Override
    public void sey() {
        System.out.println("Meow-Meow");
    }
}
