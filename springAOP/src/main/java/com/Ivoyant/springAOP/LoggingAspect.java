package com.Ivoyant.springAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.Ivoyant.springAOP.BankingService.*(..))")
    public void beforeAdvice(){
        System.out.println("[AOP] Before method execution - Checking transaction details...");
    }

    @After("execution(* com.Ivoyant.springAOP.BankingService.*(..))")
    public void afterAdvice(){
        System.out.println("[AOP] After method execution - Logging transaction status...");
    }

    @AfterReturning(value = "execution(* com.Ivoyant.springAOP.BankingService.transferFunds(..))", returning = "amount")
    public void afterReturningAdvice(double amount){
        System.out.println("[AOP] Transaction Successful! Transferred amount: $" + amount);
    }

    @AfterThrowing(value = "execution(* com.Ivoyant.springAOP.BankingService.withdraw(..))", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("[AOP] Transaction Failed! Reason: " + ex.getMessage());
    }

    @Around("execution(* com.Ivoyant.springAOP.BankingService.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AOP] Around - Before executing: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        System.out.println("[AOP] Around - After executing: " + joinPoint.getSignature().getName());
        return result;
    }
}
