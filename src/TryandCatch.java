import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) throws InterruptedException {
        int a =3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your number which  divide three");
        int b = sc.nextInt();
        try{
           int c =a/b;
            System.out.println("The result is :"+ c );
        }catch (Exception e){
            System.out.println("Sorry this is invalid the reason is : \n"+e);
        }
        Thread.sleep(1200);

        System.out.println("Program End...");
    }

}
