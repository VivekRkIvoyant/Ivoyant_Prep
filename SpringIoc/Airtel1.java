package SpringIoc;

public class Airtel1 implements Sim2 {
    @Override
    public void calling(){
        System.out.println("Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data");
    }
}

