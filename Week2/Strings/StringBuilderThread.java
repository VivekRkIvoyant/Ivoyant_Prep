package Week2.Strings;

public class StringBuilderThread extends Thread{
    StringBuilder stringBuilder;

    public StringBuilderThread(StringBuilder strBuilder){
        this.stringBuilder = strBuilder;
    }

    public void run(){
        for(int i=0;i<5;i++){
            stringBuilder.append(i);
            System.out.println(stringBuilder);
        }
    }
}
