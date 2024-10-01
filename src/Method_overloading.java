public class Method_overloading {
    //in methods the integer doesn't change if i declare the int in method
    //but if in array the array canbe change ass you can se above example
    //void is use for returning no value
    static void change(int x){
          x=76;
    }
    static void change2(int[] arr){
      arr[0]=56;
    }
    static void telljoke(){
        System.out.println(" I am Napoleon!!");
    }

//foo()!=foo(x)!=foo(x,y)!=foo(x,y,z)...foo(n)
    static void foo(){
        System.out.println("Hello World");
    }
    static  void foo(int x){

        for (int i=1;i<=x;i++){
            System.out.println("Hello World "+x);

        }

    }
    static  void foo(int x,int y){
        System.out.println("Hello World   :"+x);
        System.out.println("Hello World   :"+y);

    }
    public static void main(String[] args) {
        telljoke();
    int num =80;
    change(num);
        System.out.println(num);//now this is not change but in array this is change
  int[] math={84,52,4,63,68};
  change2(math);
        System.out.println("the value of math[0] is now changed because of the method and now it is changed to :"+math[0]);

        foo();
        foo(5);
        foo(20,50);
        //the x and y that is written are arguments and jo upper method s mein hotay hai wo parameters hotay hai
    }
}
