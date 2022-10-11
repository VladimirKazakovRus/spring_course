package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.zaurtregulov.spring.spring_introdaction")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public  Pet catBean(){
        return  new Cat();
    }
    @Bean
    public  Person personBean(){
        return new Person(catBean());
    }
}
