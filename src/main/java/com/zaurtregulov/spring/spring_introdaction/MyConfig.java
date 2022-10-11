package com.zaurtregulov.spring.spring_introdaction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
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
