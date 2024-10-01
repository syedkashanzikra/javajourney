class C1{
    public int a =52;
    private int b =52;
    protected int c =32;
    int z =4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);
    }

}


public class Adv_Acess_Modifiers {
    public static void main(String[] args) {
  C1 obj =new C1();
//  obj.meth1();
        System.out.println(obj.a);
//        System.out.println(obj.b); --> it will throws error because its a private clas and it doesnot
        System.out.println(obj.c);
        System.out.println(obj.z);

    }
}
