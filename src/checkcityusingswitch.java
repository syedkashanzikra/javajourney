import java.util.Locale;
import java.util.Scanner;
import java.sql.SQLOutput;
import java.util.Objects;

public class checkcityusingswitch {
    public static void main(String[] args) {
        System.out.println("Enter your City Name");
        Scanner city =new Scanner(System.in);
        String ct = city.next();
        String cities = ct.toLowerCase();

        switch(cities){
            case "karachi", "lahore", "faisalabad", "islamabad":
                System.out.println("Hello from Kashan to your "+cities+"City");
                break;
            default:
                System.out.println("In your area our network is not available");
        }
        //there is another method by syntax
        switch(cities){
            case "karachi":
                System.out.println("Hello from Kashan to your "+cities+"City");
                break;
            case "islamabad":
                System.out.println("Hello from Kashan to your "+cities+"City");
                break;
            case "faisalabad":
                System.out.println("Hello from Kashan to your "+cities+"City");
                break;
            case "lahore":
                System.out.println("Hello from Kashan to your "+cities+"City");
                break;
            default:
                System.out.println("In your area our network is not available");
        }
        System.out.println("Enter your Age");
        Scanner aged =new Scanner(System.in);
        Integer age =aged.nextInt();

//Enhanced Switch statement
        switch (age) {
            case 13, 14, 15, 16, 17 -> System.out.println("You are a Teenager");
            case 18, 19, 20, 21 -> System.out.println("You are a Youth");
            case 22, 23, 24, 25, 26 -> System.out.println("Go get a job");
            case 27, 28, 29, 30 -> System.out.println("Go get a wife");
            default -> System.out.println("Enjoy your life");
        }
    }
}
