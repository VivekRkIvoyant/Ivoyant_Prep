package Week3.MultiThreads;

public class BankAccount {

    private int balance = 200;

    public synchronized void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw: "+amt);
        if(balance>=amt){
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
}
