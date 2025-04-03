package org.example;

import org.springframework.stereotype.Component;

@Component
public class Docomo implements Sim{

    @Override
    public void calling(){
        System.out.println("Docomo Calling");
    }

    @Override
    public void data(){
        System.out.println("Docomo Data");
    }
}


