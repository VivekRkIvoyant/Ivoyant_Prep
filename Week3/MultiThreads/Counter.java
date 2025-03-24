package Week3.MultiThreads;

public class Counter extends Thread{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            increment();
        }
    }

    private int count=0;

    public synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
