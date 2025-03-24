package Week3.Threads;

public class DemonThreads extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        DemonThreads demonThreads = new DemonThreads();
        demonThreads.setDaemon(true);
        demonThreads.start();
        System.out.println(Thread.currentThread().getName());
    }
}
