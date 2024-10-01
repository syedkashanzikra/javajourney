import java.util.Scanner;

//problem no1
class Employeetest{
    int salary;

    public void getSalary() {
        System.out.println(salary);

    }
    String name ;
    public void getName(){
        System.out.println(name);
    }
    public String setName(String a){
        return name=a;
    }
}
//problem no 2 Cellphone
class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }public void vibrate(){
        System.out.println("Vibrating...");
    }public void callfriend(){
        System.out.println("Calling a Friend...");
    }
}
//problem no 3
class Square{
    int side;

    public int area() {
        return side*side;
    }public int perimeter() {
        return 4*side;
    }
}
//for Rectangle Problem
class rectangle{
    int length;
    int width;
    //for calculating area
    public int area(){
        return width*length;

    }
    public int perimeter() {
        return 2*(width * length);
    }

    }
    class tommy{
     public void run(){
         System.out.println("Tommy is running");
     }
        public void walk(){
            System.out.println("Tommy is walking");
        }
        public void hit(){
            System.out.println("Tommy is Hitting");
        }
    }
public class Practiceset_8_OOPs {
    public static void main(String[] args) {
        //making an object
        Employeetest Employee1 = new Employeetest();
        Employee1.salary=10000;
        Employee1.getSalary();
        Employee1.name="Kashan";
        Employee1.getName();
        String c =Employee1.setName("Syed Kashan Abbas Naqvi");
        System.out.println(c);
        //problem no 2
       /* cellphone samsung =new cellphone();
        samsung.callfriend();
        samsung.ring();
        samsung.vibrate();
*/
        //problem 3
         Square sq1=new Square();
        System.out.println("Enter Your Side for Getting area and Perimeter");
        Scanner sc =new Scanner(System.in);
        sq1.side= sc.nextInt();
        System.out.println("Your Area is "+sq1.area());
        System.out.println("Your Perimeter is "+sq1.perimeter());
//problem4
        System.out.println("Area and Perimeter for Rectangle");
        rectangle rc1=new rectangle();
        rc1.length=8;
        rc1.width=5;
        System.out.println(rc1.area());
        System.out.println(rc1.perimeter());


    //problem5
tommy player1=new tommy();
player1.hit();
player1.run();
player1.walk();
    }


}
