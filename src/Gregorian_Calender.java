import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Gregorian_Calender {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c.get(Calendar.DAY_OF_YEAR));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
     /*   System.out.println("You Wanna know The time Now");
//        String  a ="Yes";
//        try{
            Scanner sc =new Scanner(System.in);
            a =sc.next().toLowerCase();

            if (a.equals("yes")){
                System.out.println("Your Time");
                System.out.println(c.get(Calendar.HOUR_OF_DAY )+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+":" +c.get(Calendar.MILLISECOND));

            }else {
                System.out.println("No Problem");
            }


        }catch (Exception e){
            System.out.println(e + "Your Error");
        }
        */
//Gregorian Methods of Class

        GregorianCalendar gc =new GregorianCalendar();
        //checks that its leap year and returns boolean
        System.out.println(gc.isLeapYear(2006));
        System.out.println(gc.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println("-------------------------------------------");
        Scanner gmt =new Scanner(System.in);
        int i= gmt.nextInt();
        try{

        System.out.println(TimeZone.getAvailableIDs()[i]);
        }catch (Exception e){
            System.out.println(e +"This is the eror");
        }
        System.out.println("Hello");

    }
}
