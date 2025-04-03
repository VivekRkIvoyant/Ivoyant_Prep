package org.example;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{

    @Override
    public void calling() {
        System.out.println("Jio Sim Calling");
    }

    @Override
    public void data(){
        System.out.println("Jio Sim Data");
    }
}

