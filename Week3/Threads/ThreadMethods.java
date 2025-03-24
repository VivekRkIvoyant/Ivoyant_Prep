package Week3.Threads;

public class ThreadMethods extends Thread{

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("This is running...");
        }catch (InterruptedException e){
            System.out.println("This is interrupted: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThreadMethods threadMethods = new ThreadMethods();
        threadMethods.start();
        threadMethods.interrupt();
    }
}
