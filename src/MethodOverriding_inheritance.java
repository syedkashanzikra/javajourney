class A{
     public int meth1() {
        return 4;
    }
    public  void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override //we use overide as for checking that overiding is working or not ----> it is optional but useful
    public  void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public  void meth3(){
        System.out.println("I am method 3 of class B");
    }


}



public class MethodOverriding_inheritance {
    public static void main(String[] args) {
        A a =new A();
        a.meth2();

        B b =new B();

        b.meth2();// but we want to print the meth2 of b not a object so we use method overridding
    }
}
