import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am ToString Method()";
    }

    @Override
    public String getMessage() {
        return "I am get Message()";
    }
}

public class Exception_class {
    public static void main(String[] args) {

        int a ;
      boolean flag =true;
      while (flag){
        System.out.println("Enter Your Number of A");
        Scanner sc =new Scanner(System.in);
        a= sc.nextInt();
        if (a<9){
            try{
                throw new MyException();
            //    throw new  ArithmeticException("This is An Exception");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());


                e.printStackTrace();
                System.out.println("End Finally");
                flag =false;

            }
            System.out.println("End Finally");


        }else
        {
            System.out.println("Enter number less than 9");
        }

    }
    }
}
