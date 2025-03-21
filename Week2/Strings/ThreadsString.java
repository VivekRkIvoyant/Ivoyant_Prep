package Week2.Strings;

public class ThreadsString extends Thread{
    StringBuffer sb;

    ThreadsString(StringBuffer sb){
        this.sb = sb;
    }

    public void run(){
        for(int i=0;i<5;i++){
            sb.append(i);
            System.out.println(sb);
        }
    }
}
