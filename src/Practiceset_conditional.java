import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class Practiceset_conditional {
    public static void main(String[] args) {
        System.out.println("BIEK");
        //For Maths
        System.out.println("Enter your Maths Number");
        Scanner mth = new Scanner(System.in);
        float mthmrks = mth.nextFloat();
        //for English
        System.out.println("Enter your English Number");
        Scanner eng = new Scanner(System.in);
        float engmrks = eng.nextFloat();
        //for Computer Science
        System.out.println("Enter your Computer Number");
        Scanner cmp = new Scanner(System.in);
        float cmpmrks = cmp.nextFloat();

        float percentage = (mthmrks + engmrks + cmpmrks) * 100 / 300;

        if (mthmrks >= 33 && engmrks >= 33 && cmpmrks >= 33 && percentage >= 40) {
            System.out.println("You have Successfully passed \n\t Your Maths Marks is: " + mthmrks
                    + "\n\t Your English Marks is: " + engmrks + "\n\t Your Computer Marks is: " + cmpmrks
                    + " \n\t And your overall Percentage is " + percentage + "%");

        } else if (mthmrks <= 33 && engmrks <= 33 && cmpmrks <= 33 && percentage <= 40) {
            System.out.println("You Totally fail in All subjects");
        } else if (mthmrks <= 33) {
            System.out.println("You are fail in maths subject because your marks are : " + mthmrks + " Which is lower than 33");
        } else if (engmrks <= 33) {
            System.out.println("You are fail in english subject because your marks are : " + engmrks + " Which is lower than 33");
        } else if (cmpmrks <= 33) {
            System.out.println("You are fail in computer subject because your marks are : " + cmpmrks + " Which is lower than 33");
        } else if (percentage <= 40) {
            System.out.println("You are fail in all over percentage because your percentage is : " + percentage + " Which is lower than 40");
        }

        //problem 4
        System.out.println("Enter Your Date");
        Scanner date = new Scanner(System.in);
        int dte = date.nextInt();
        switch (dte) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Get to Work");
        }
//problem 6
        System.out.println("Enter your Website url");
        Scanner link = new Scanner(System.in);
        String url = link.next();
        if (url.endsWith("org")) {
            System.out.println("It is an Organizational Website");
        } else if (url.endsWith("com")) {
            System.out.println("It is a Commercial Website");

        } else if (url.endsWith("pk")) {
            System.out.println("It is Pakistani Website");

        } else if (url.endsWith("in")) {
            System.out.println("It is Indian Website");

        }
    }
    }

