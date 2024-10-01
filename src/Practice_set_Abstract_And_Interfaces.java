///problemm 1&3
abstract class Pen{
   abstract void write();
   abstract void refill();
}
class Fountainpen extends Pen{
    public void ChangeNib(){
        System.out.println("changing the nib");
    }
    @Override
    void write() {
        System.out.println("Write with pen");
    }

    @Override
    void refill() {
        System.out.println("Refill the Pen");
    }
}
//problem no 3
class Monkey{
  public  void Jump(){
      System.out.println("Jumping");
  }
    public  void Bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimals{
    void sleep(String s);
    void Eat(String a);
}
class Humans extends Monkey implements BasicAnimals{
    @Override
    public void sleep(String s) {
        System.out.println( s+" is Sleeping");
    }

    @Override
    public void Eat(String a) {
        System.out.println(a+" is Eating");
    }
}

//Q4
abstract class Telephone2{
    abstract  public void disconnect();
    abstract public void lift();
    abstract public void Ringing();

}
class Smart_Telephone extends Telephone2{
    @Override
    public void lift() {
        System.out.println("lifting the s_telephone");
    }

    @Override
    public void Ringing() {
        System.out.println("Ringing...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect...");
    }
}
//q5
interface Tv_Remote{
    void channel1();
    void channel2();
}
interface SmartTvRemote extends Tv_Remote{
    void channel3();
    void channel4();
}
//question 6
class Tv implements Tv_Remote{
    @Override
    public void channel1() {
        System.out.println("channel1");
    }

    @Override
    public void channel2() {
        System.out.println("channel2");
    }
}

public class Practice_set_Abstract_And_Interfaces {
    public static void main(String[] args) {
        //problem1&2
        Fountainpen dollar =new Fountainpen();
        dollar.refill();
        //problem 3
        Humans Human1 =new Humans();
        Human1.Eat("Kashan");
        Human1.Jump();
        //problem 4 Polymorphism in Q3
        BasicAnimals b1 =new Humans();
        b1.Eat("Hello");
        //Q4 Polymorphism in Telephone
Telephone2 obj=new Smart_Telephone();
obj.lift();
//
    }
}
