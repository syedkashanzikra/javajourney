import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();  //actual date;
        System.out.println(dt);

        //but for formatting the date structure
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-mm-yyyy --E"); //date ka format
        DateTimeFormatter dt2 =DateTimeFormatter.ISO_LOCAL_DATE;
//        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/time/format/DateTimeFormatter.html ==> Website for Time formater and the options


        String Dateformatted =dt.format(dt2);     //actual date and format ko mix krdo or string mein  save krdo
        String Dateformatted2 =dt.format(dtf);     //actual date and format ko mix krdo or string mein  save krdo
        System.out.println(Dateformatted);
        System.out.println(Dateformatted2);
    }
}
