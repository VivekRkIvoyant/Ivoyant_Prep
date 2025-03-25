package Week3.MultiThreads;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using pen "+this+" and trying to finish writing");
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using pen "+this);
    }
}

class Paper{

}
