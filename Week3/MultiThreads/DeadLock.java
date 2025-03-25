package Week3.MultiThreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock{

    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        deadLock.outerMethod();
    }

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer Method");
            innerMethod();
        }finally {

        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Lock");
            outerMethod();
        }finally {
            lock.unlock();
            lock.unlock();
        }
    }
}
