import java.util.Scanner;
public class Practiceset_07_Methods {
//problem no 1 make a multiplication table using methods
    public static void table(int tbl_num){
        for (int i=1;i<=10;i++){
            System.out.println(tbl_num+"x"+i+"="+tbl_num*i);
        }
    //problem no 2
        /*
        print
        *
        **
        ***
        ****
        using method
         */
    }
        public static void pattern1(int n){
            for (int i =0;i<=n-1;i++){
                for (int j =0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
//problem no 3
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+sumRec(n-1);
        }
    }
//problem no5
public static void pattern2(int n){

    for (int i=n;i>0;i--){
        for (int j =0;j<i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
//problem no 6
    static  int fib(int n){
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }else {
            return n+ fib(n-1)+fib(n-2);
        }
    }
    //problem no 7
    //calculate average using varargs
    public static int Avg(int...arr){
        int result =0;
        for (int a:arr){
              result +=a;
          }

        return result/ arr.length;
    }
    //problem no 2 using recursive function
    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i =0;i<n;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //problem no 10 changing the celcius into farenhite
    static void ctof(double n){
        //°F = (9/5) °C+32.
        double p=(9/5f*n)+32;
        System.out.println("Your given celsius is change into farenhite  :  "+p);
    }
    public static void main(String[] args) {

//problem no 1 make a multiplication table using methods
    //    System.out.println("Write Your Number which is multiplied 10 times");
      //  Scanner sc =new Scanner(System.in);
       // int tbl_nums = sc.nextInt();
      //  table(tbl_nums);
    //problem 2 draw pattern
//        pattern1(5);
        //problem 3
        //sum of n natyral numbers
        int c =sumRec(5);
        System.out.println(c);
        //problem no 5
      //  pattern2(5);
        //problem  6
        int k =fib(5);
        System.out.println("Hello" +k);
        //problem no 7
        //Avg function
        int l =Avg(50,50,30);
        System.out.println(l);

        //problem  no8
        pattern1_rec(5);
        //problem  no 10
//        int p = (5 * 9 / 5) + 32;
//        System.out.println(p);
         ctof(30);
    }
}
