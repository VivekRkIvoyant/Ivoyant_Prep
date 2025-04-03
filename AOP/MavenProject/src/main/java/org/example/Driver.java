package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver{

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AirtelSim sim = context.getBean(AirtelSim.class);
        try {
            sim.init();
            sim.simUsage();
            sim.destroy();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
