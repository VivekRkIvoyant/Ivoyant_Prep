package Week3.Threads;

public class ThreadMethods2 extends Thread{

    @Override
    public void run(){
       for(int i=0;i<5;i++){
           System.out.println(Thread.currentThread().getName());
           Thread.yield();
       }
    }

    public static void main(String[] args) {
        ThreadMethods2 threadMethods2 = new ThreadMethods2();
        ThreadMethods2 threadMethods3 = new ThreadMethods2();
        threadMethods2.start();
        threadMethods3.start();
    }
}
