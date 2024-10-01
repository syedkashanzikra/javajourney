import java.awt.*;
import java.util.Scanner;

public class Practice_set_errorsandExceptions {
    public static void main(String[] args) {

//problem 2
        /*
        System.out.println("There is three times");
for (int i=0;i<3;i++){
    System.out.println("Enter your Number Which wil divide 3");
    try{
        int a=3;
        Scanner sc =new Scanner(System.in);
        int b= sc.nextInt();
        int c =a/b;
        System.out.println(c);
    }catch (ArithmeticException e){
        System.out.println("Haha");
    }catch (IllegalArgumentException e){
        System.out.println("Hehe");
    }catch (Exception e){
        System.out.println("Errorr");
    }
}
*/
        //Problem 3 &&4
        boolean k=true;

        while (k) {


            int[] marks = {51, 32, 45, 89};
            System.out.println("Enter your Array Number");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            try {
                System.out.println("Your Entered Number was :" + b);
                System.out.println("The given Array at given index" + marks[b]);

          k=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
//                i++;
                System.out.println("Please enter valid Value");
            }

        }

    }
}
