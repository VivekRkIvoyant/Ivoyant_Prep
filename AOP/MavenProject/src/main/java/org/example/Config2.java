package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class Config2 {
    @Bean
    @Scope("singleton")
    public HelloWorld singletonBean(){
        return new HelloWorld();
    }

    @Bean
    @Scope("prototype")
    public HelloWorld prototypeBean(){
        return new HelloWorld();
    }
}

