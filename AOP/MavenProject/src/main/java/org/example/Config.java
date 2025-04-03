package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public AirtelSim simBrand(){
        return new AirtelSim();
    }
}
