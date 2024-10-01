class base{
    public base() {
        System.out.println("This is base constructor");
    }
    public base (int a){
        System.out.println("This is base constructor which gives value of a :" + a+"  ");

    }

}
class derived extends base{
    public derived() {

        //if i want  the parent means(base) constructor which have arguments i want to use instead of default constructor I use super
       /// super(0);

        System.out.println("This is Derived constructor");
    }
    //overloaded constructor
    public derived(int a,int b)
    {
        super(a);
        System.out.println("This is base constructor which gives value of b : " + b);

    }
}
class childOfDerived extends derived{  //ye derived ka bacha or son node hai
    childOfDerived(){
        System.out.println("I am constructor of Child of Derived Class");
    }
  public  childOfDerived(int a,int b ,int c){
        super(a,b);
        System.out.println("This is base constructor which gives value of c : " + c);

    }

}

public class Inheritance_Constructors {
    public static void main(String[] args) {
//  base b =new base();

  //derived d =new derived();
        // if i doesnot attacth constructor in second class which has extends its default constuctor should be first class
  //derived d =new derived(14,15);
  //if i want  the parent means(base) constructor which have arguments i want to use instead of default constructor I use super
//childOfDerived c =new childOfDerived();
childOfDerived c =new childOfDerived(14,21,32);

    }
}
