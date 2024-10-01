import java.util.Scanner;

public class recursive {
    public static int recursion(int n){
        if (n == 1 || n == 0) {
            return 1;
        }else {
            return n*recursion(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Write your number which fatorial sum is shown");
        Scanner userfac=new Scanner(System.in);

int x= userfac.nextInt();

        System.out.println("The Factorial of : "+x+"  is "+recursion(x));
    }
}
