import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class PracticeSet_Advance_Java {
    public static void main(String[] args) {
        //PSQ1
        ArrayList<String> Students =new ArrayList<>();
        Students.add("Kashan");
        Students.add("Kashan1");
        Students.add("Kashan2");
        Students.add("Kashan3");
        Students.add("Kashan4");
        Students.add("Kashan5");
        Students.add("Kashan6");
        Students.add("Kashan7");
        Students.add("Kashan8");
        Students.add("Kashan9");
        for ( Object o :Students) {
            System.out.println(o);
        }

//        PSQ5
//check that any duplicate elmet can print in hashset
        HashSet<Integer> hs =new HashSet<>();
        hs.add(55);
        hs.add(6);
        hs.add(69);
        hs.add(68);
        hs.add(6); ///duplicate value
        System.out.println(hs);
 //PSQ2
        Date d =new Date();
        System.out.println(d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds() );

        //PSQ3

        Calendar c =Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

        //PSQ4

        LocalDateTime l1 = LocalDateTime.now();
        DateTimeFormatter d1 =DateTimeFormatter.ISO_LOCAL_TIME;
        String dtf =l1.format(d1);
        System.out.println(dtf);

    }
}
