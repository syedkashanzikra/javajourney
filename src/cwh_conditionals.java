import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class cwh_conditionals {
    public static void main(String[] args) {
        System.out.println("REGISTER YOURSELF!!");
        System.out.println("Enter Your Name");
        Scanner rgstrname =new Scanner(System.in);
        String registername =rgstrname.next();
        //for register Password
        System.out.println("Enter Your Password");
       Scanner rgstrpass =new Scanner(System.in);
        String registerpass =rgstrpass.next();

        //for login
        System.out.println("Want to login !");
        //for username
        System.out.println("enter Your Register Username");
        Scanner lognname =new Scanner(System.in);
        String loginname =lognname.next();

        //Now for Login Password
        System.out.println("enter Your Register Password");
        Scanner lognpass =new Scanner(System.in);
        String loginpassword =lognpass.next();

        //Now FOr Checking
        if(Objects.equals(registername, loginname) && Objects.equals(registerpass, loginpassword)){
            System.out.println("You Login Successfully");
        } else if (!Objects.equals(registername, loginname) && !Objects.equals(registerpass, loginpassword)) {
            System.out.println("You enter wrong Username & Password also");
        }else if (!Objects.equals(registername, loginname)) {
            System.out.println("You enter wrong Username");
        }else if (!Objects.equals(registerpass, loginpassword)) {
            System.out.println("You enter wrong Password");
        }

        //Now We Make a Quiz
        //for first city
        System.out.println("What is the Capital of Pakistan?");
        Scanner qcity1 =new Scanner(System.in);
        String quizcity1 = qcity1.next();
        if (Objects.equals(quizcity1, "Islamabad") || Objects.equals(quizcity1, "islamabad")){
            System.out.println("Your answer is correct");
        }else {
            System.out.println("Wrong answer");
        }
        //for second city
        System.out.println("What is the Capital of India?");
        Scanner qcity2 =new Scanner(System.in);
        String quizcity2 = qcity2.next();
        if (Objects.equals(quizcity2, "Newdelhi") || Objects.equals(quizcity2, "newdelhi")){
            System.out.println("Your answer is correct");
        }else {
            System.out.println("Wrong answer");
        }
        //for third city
        System.out.println("What is the Capital of Turkey?");
        Scanner qcity3 =new Scanner(System.in);
        String quizcity3 = qcity3.next();
        if (Objects.equals(quizcity3, "Istanbul") || Objects.equals(quizcity3, "istanbul")){
            System.out.println("Your answer is correct");
        }else {
            System.out.println("Wrong answer");
        }



    }
}
