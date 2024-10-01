import java.util.Objects;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter Your city");
        Scanner cname =new Scanner(System.in);
        String city1= cname.next();
        String cityname =city1.toLowerCase();
        if(Objects.equals(cityname, "karachi")){
            System.out.println("Hello You are from Karachi");
        }else {
            System.out.println("in your city we have no branches");
        }
    }
}
