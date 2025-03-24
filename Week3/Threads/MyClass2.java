package Week3.Threads;

public class MyClass2 implements Runnable{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        Thread t1 = new Thread(myClass2);
        MyClass2 myClass3 = new MyClass2();
        Thread t2 = new Thread(myClass3);
        t1.start();
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);


        try{
            System.out.println(t1.getState());
            t1.sleep(2000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(t1.getState());
        }

        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("<<< This is main Thread >>>");
    }
}
