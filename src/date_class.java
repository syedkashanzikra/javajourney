import java.util.Date;

public class date_class {
    public static void main(String[] args) {
        Date d =new Date();
        System.out.println(d); //it gives the curent date and time
        System.out.println(d.getTime());//in mm times fom 1970
        System.out.println(d.getDate());
    }
}
