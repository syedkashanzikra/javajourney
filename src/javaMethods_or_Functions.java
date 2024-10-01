public class javaMethods_or_Functions {
    //for making an function or method is
    //ythere are two methods
    //static wala
    //object wala ff
    static  int logic(int x,int y){
            int z;
        if(x>y){
            z=(x+y)*5;
        }else {
            z=x+y;
        }
        return z;
    }
    //method 2 object in mysum
     int mysum(int x,int y){
        int z;
        z=x+y;
        return z;
    }


    public static void main(String[] args) {
  int a=5;
  int b=7;
  //new method invocation
  javaMethods_or_Functions msum =new javaMethods_or_Functions();
int k=msum.mysum(a,b);
  int c =logic(a,b);
  //second time repetition
  int a1=85;
  int b1=2;
  int m=msum.mysum(a1,b1);
  int c1=logic(a1,b1);
  //if else loop
        System.out.println(c);
        System.out.println(c1);
        //mySum output
        System.out.println(k);
        System.out.println(m);
    }
}
