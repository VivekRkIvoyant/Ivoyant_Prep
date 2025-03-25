package Week3.MultiThreads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 200;
    private Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw: "+amt);
        if(balance >= amt){
            System.out.println(Thread.currentThread().getName()+" Proceeding with withdrawals");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance = balance - amt;
            System.out.println(Thread.currentThread().getName()+" completed Withdrawal: Remaining Balance: "+balance);
        }else {
            System.out.println(Thread.currentThread().getName()+" Insufficient Balance ");
        }
    }

    public void withDrawAmount(int amt){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw the amount: "+amt);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amt){
                    System.out.println(Thread.currentThread().getName()+" Processing with the withdrawal");
                    try{
                        Thread.sleep(3000);
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                    balance = balance - amt;
                    System.out.println(Thread.currentThread().getName()+" completed with withdrawal: Remaining Balance: "+balance);
                }
                else {
                    System.out.println(Thread.currentThread().getName()+" Insufficient Balance ");
                }
            }else {
                System.out.println(Thread.currentThread().getName() +" Could not acquire the lock : try again later");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}


