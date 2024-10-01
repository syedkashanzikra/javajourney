import java.util.Calendar;
import java.util.TimeZone;

public class Calender_class {
    public static void main(String[] args) {
//        Calendar c =Calendar.getInstance();  //making an object of calender class
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c =Calendar.getInstance(TimeZone.getTimeZone("PLT"));  //making an object of calender class
        //for more timezones Id https://docs.oracle.com/middleware/1221/wcs/tag-ref/MISC/TimeZones.html
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());//prints all dtime date today


    }
}
