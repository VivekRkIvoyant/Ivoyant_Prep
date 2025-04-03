package org.example;

import org.springframework.stereotype.Component;

@Component
public class AirtelSim {

    public void init() throws Exception{
        System.out.println("Bean Hello World has been instantiated, and I am the init() method");
    }

    public void simUsage(){
        System.out.println("Am using Airtel SIM");
    }

    public void destroy() throws Exception{
        System.out.println("Container has been closed , and I am the destroy method");
    }
}
