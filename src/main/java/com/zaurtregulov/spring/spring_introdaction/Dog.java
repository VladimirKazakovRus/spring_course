package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Dog implements Pet{
//    private String name;
    public Dog(){
        System.out.println("bean Dog is created");
    }
//    @PostConstruct
//    public void init(){
//        System.out.println("class Dog: init metod");
//    }
//    @PreDestroy
//    public  void destroy(){
//        System.out.println("class Dog: destroy metod");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void sey(){
        System.out.println("Bow-wow");
    }
}
