package SpringIoc;

public class Mobile1 {

    public static void main(String[] args) {
        Sim2 sim = new Jio1();
        sim.calling();
        sim.data();

        Sim2 sim1 = new Airtel1();
        sim1.data();
        sim1.calling();
    }
}

