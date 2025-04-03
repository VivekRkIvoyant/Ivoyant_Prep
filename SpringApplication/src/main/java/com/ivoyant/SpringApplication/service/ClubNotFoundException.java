package com.ivoyant.SpringApplication.service;

public class ClubNotFoundException extends RuntimeException{

    public ClubNotFoundException(String message){
        super(message);
    }
}
