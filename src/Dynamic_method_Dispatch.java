class Phone{
    public void on(){
        System.out.println("Your Phone has been on...");
    }
    public void greet(){
        System.out.println("Greetings to you!!!");
    }
}
class Smartphone extends Phone{
   @Override
    public void on(){
        System.out.println("Your SmartPhone has been on...");
    }
    public void welcome(){
        System.out.println("Welcome to smartphone");
    }



}
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
//        Phone nokia =new Phone();
//        nokia.greet();    this is allowed
//        Smartphone smsung =new Smartphone();      //this is allowed
        Phone p =new Smartphone(); //this is allowed
                        //this allowed and phone is super class and refrence && the Smarrtphone is object
        //if we call same on method the smartphone method call because it is an object
        p.on();
       //Smartphone s =new phone(); this is not allowed because phone is super class and  smart ph0ne is sub class
//now if you want to  run the methods of Smartphone which rae not overrided you have to make a new object with a reference of the
// smartphone becuase it is not supported
//here is an example
 //p.welcome(); it gives error

    }
}
