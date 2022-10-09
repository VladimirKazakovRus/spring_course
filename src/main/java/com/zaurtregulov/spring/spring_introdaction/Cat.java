package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.stereotype.Component;

import javax.swing.*;
@Component("catBean")
public class Cat implements Pet {
    @Override
    public void sey() {
        System.out.println("Meow-Meow");
    }
}
