import java.util.Scanner;
public class newStrings {
    public static void main(String[] args) {
        //In the Java there are are four types to print
        System.out.print("Hello");//for no  spacing
        System.out.println("Hello");//for spacing a  line
        //now
//        int a = 5  ;
//        float s = 8.6f;
//        System.out.printf("The var a is %d and the var s is %f", a,s);
        //This is All Same function like printf
//        System.out.format("The var a is %d and the var s is %f", a,s);

        //----------------------------------------//
        // Now for getting input from user as string and Printing it
        System.out.println("Enter Your Name");
        Scanner sc =new Scanner(System.in);
//        String c = sc.next();                 // for printing only without space
        //For Printing also space
        String c = sc.nextLine();
        System.out.println(c);
    }
}
