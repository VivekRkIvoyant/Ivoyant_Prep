package com.Ivoyant.springAOP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectOrientedProgrammingApplication implements CommandLineRunner {

	private final BankingService bankingService;

	public AspectOrientedProgrammingApplication(BankingService bankingService) {
		this.bankingService = bankingService;
	}


	public static void main(String[] args) {
		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
	}

	@Override
	public void run(String... args) {
		bankingService.deposit(1000);
		try {
			bankingService.withdraw(500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		bankingService.transferFunds(200);
	}

}

