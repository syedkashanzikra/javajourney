interface bicycle{
    void newCandence(int newValue);
    int newGear(int newValue);
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface Horn{
    void pee();
    void poo();
}
//if we want to use an in interface in a class we use word implements
//we can implement many interfaces in one class
class SamsungBicycle implements bicycle,Horn{
    int candence =0;
    int gear =1;
    int speed =1;

    @Override
    public void newCandence(int newValue) {
               candence= newValue;
    }

    @Override
    public void applyBrake(int decrement) {
        speed =speed-decrement;
    }

    @Override
    public int newGear(int newValue) {
        this.gear=newValue+gear;
        return newValue;
    }

    @Override
    public void speedUp(int increment) {
        this.speed=speed+increment;
        if (this.speed>=5){
            System.out.println("You are Speeding Very Fast");
        }else {
            System.out.println("You are Speed up");
        }
    }
//Horn Methods

    @Override
    public void pee() {
        System.out.println("peee peee peee peee");
    }

    @Override
    public void poo() {
        System.out.println("Pooo pooo poo pooo");
    }
}



public class Interfaces {
    public static void main(String[] args) {
 SamsungBicycle myBike =new SamsungBicycle();
 myBike.speedUp(46);
 int c = myBike.newGear(4);
        System.out.println(c);
        myBike.pee();
        myBike.poo();
    }
}
