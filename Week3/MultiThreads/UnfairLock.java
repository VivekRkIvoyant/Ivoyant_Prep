package Week3.MultiThreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock implements Runnable {

    private final Lock lock = new ReentrantLock(true);

    public void accessResources(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Acquired the lock");
            Thread.sleep(3000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+ " Released the lock");
        }
    }

    public static void main(String[] args) {
        UnfairLock exm = new UnfairLock();
        Thread t1 = new Thread(exm);
        Thread t2 = new Thread(exm);
        Thread t3 = new Thread(exm);

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        accessResources();
    }
}

