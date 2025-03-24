package Week3.Threads;

public class Basic extends Thread{

    @Override
    public void run(){
        MyClass myClass = new MyClass();
        MyClass2 myClass2 = new MyClass2();
        Thread t = new Thread(myClass2);
        World w = new World();
        myClass.start();
        w.start();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }

        System.out.println(t.getState());
    }

    public static void main(String[] args) {
        Basic trd1 = new Basic();
        System.out.println(trd1.getState());
        System.out.println("Name of current thread: "+Thread.currentThread().getName());
        trd1.start();
        try{
            trd1.sleep(1000);
            System.out.println(trd1.getState());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


//    Demon Threads are threads that run in background
//    JVM dose'nt wait to demon threads to get their execution completed
}

