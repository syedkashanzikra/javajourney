import java.util.Scanner;

public class Handling_SpecificTry {
    public static void main(String[] args) {
//        int [] marks= new int[3];  //initilaizing the array and the indexx
        int[] marks={12,63,69};

        System.out.println("Enter the index number Yaad sey array starts from 0");
        Scanner sc =new Scanner(System.in);
        int ind =sc.nextInt();

        System.out.println("Enter the  number  which divides the array index number ");
        Scanner sc1 =new Scanner(System.in);
        int number =sc1.nextInt();

            try {
                System.out.println("Your value of given index number is "+marks[ind]);
                System.out.println("Your value of  array index number is divided by your number is "+marks[ind]/number);
            }catch (ArithmeticException e){
                System.out.println("You are facing ArithmeticException  the Reason is,");
                System.out.println(e);

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You are facing ArrayIndexOutOfBoundsException  the Reason is,");
                System.out.println(e);
            }
            catch (Exception e){
                System.out.println("You are facing an random error the Reason is,");
                System.out.println(e);
            }
    }
}
