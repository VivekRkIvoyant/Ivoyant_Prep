package com.Ivoyant.springAOP;

import org.springframework.stereotype.Service;

@Service
public class BankingService {

    public void deposit(double amount){
        System.out.println("depositing: $"+amount);
    }

    public void withdraw(double amount){
        if(amount>5000){
            throw new RuntimeException("withdraw limit exceeded");
        }
        System.out.println("withdrawing: $"+amount);
    }

    public void transferFunds(double amount){
        System.out.println("transferring: $"+amount);
    }
}
