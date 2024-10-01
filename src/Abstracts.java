abstract class Parent {
    public void name(){
        System.out.println("My name is kashan");
    }
    //abstract method make the class abstract
    abstract public void greet();
}
 class Child1 extends Parent{
     @Override
     public void greet() {
         System.out.println("Hello ");
     }
 } //either the derived class be abstract or use the abstract method wrna error ayega
abstract class Child2 extends Parent{

    public void welcome() {
        System.out.println("k");
    }
}

public class Abstracts {
    public static void main(String[] args) {
        Child1 ahmed =new Child1();
        
    }
}
