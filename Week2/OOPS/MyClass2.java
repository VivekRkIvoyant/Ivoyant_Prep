package Week2.OOPS;

public class MyClass2 implements InterfaceClass{
    int speed =10;
    int gear = 1;

    @Override
    public void changeGear(int a){
        gear = a;
    }

    @Override
    public void speedup(int inc) {
        speed = speed+inc;
    }

    @Override
    public void applyBrakes(int dec) {
        speed = speed-dec;
    }

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        myClass2.changeGear(1);
        myClass2.speedup(10);
        myClass2.applyBrakes(2);

        System.out.println("Current Speed: "+myClass2.speed+" and current gear: "+myClass2.gear);
    }
}
