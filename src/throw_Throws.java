import java.util.Scanner;

class NegativeException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be in Negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be in Negative";
    }
}
public class throw_Throws {

    public static double takeArea(double r) throws NegativeException{
        if (r<0){
            throw new NegativeException();
        }
    return Math.PI*r*r;
    }
    public static float divide(float a,float b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your nominator");
        Scanner sc =new Scanner(System.in);
        int nom = sc.nextInt();
        System.out.println("Enter Your Denominator");
        Scanner sc1 =new Scanner(System.in);
        int denom = sc1.nextInt();
   try{

         float c =divide(nom,denom);
       System.out.println(c);

   }catch (Exception e){
       System.out.println("Exception");
   }


   try {
     double k =  takeArea(5);
       System.out.println(k);
   }catch (Exception e){
       System.out.println("Exception");
   }

    }
}
