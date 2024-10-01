import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your First Value");
        int a1 =sc.nextInt();
        System.out.println("Input your Second Value");
      int a2=sc.nextInt();
      int sum = a1+a2;
        System.out.println("Your Total Number Is ");
        System.out.println(sum);


        System.out.println("Now For Sub");
        Scanner subs = new Scanner(System.in);
        System.out.println("Enter Your Bigger Value");
        int s1 = subs.nextInt();
        System.out.println("Enter your Lower Value");
        int s2 = subs.nextInt();
        int sub=s1-s2;
        System.out.println("Your Subracted Value is");
        System.out.println(sub);


        System.out.println("Now for Multiplication");
        Scanner mul = new Scanner(System.in);
        System.out.println("Enter Value");
        int m1 = sc.nextInt();
        System.out.println("Enter Value");
        int m2 =sc.nextInt();
       int multiply = m1*m2;
        System.out.println("Now your Multiplied Value is");
        System.out.println(multiply);



        System.out.println("Now For Division");
        Scanner divide = new Scanner(System.in);
        System.out.println("Enter your dividend");
         float d1 =sc.nextFloat();
        System.out.println("Enter your divisor ");
        float d2 = sc.nextFloat();
        float div = d1 / d2 ;
        System.out.println("Your quotient is");
        System.out.println(div);

        System.out.println("Now for Getting Square Root");
        Scanner sq =new Scanner(System.in);
        System.out.println("Enter Your Value");
         int sq1 =sc.nextInt();
        System.out.println("Your Value Square root");
        System.out.println(sq1*sq1);
   //there are many functions of sc but we use sc.nextInt,sc.NextFloat and anoteher which is for telling that the condition is true or not which is
        //sc.hasNextInt
      Scanner check =new Scanner(System.in);

        System.out.println("For checking that the entered value is int or not");
        //if point nhi ayega its true
        //if point ayega its false
     boolean b1 =check.hasNextInt();
        System.out.println(b1);
        //////////////////////////
        Scanner check2 =new Scanner(System.in);
        System.out.println("For checking that the entered value is float  or not");

        boolean b2 = check2.hasNextFloat();
        System.out.println(b2);

    }
}
