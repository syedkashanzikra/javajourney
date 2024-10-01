import java.util.Scanner;

public class Practice_set5loops {
    public static void main(String[] args) {
        //Question For Printing
//        ****
//        ***
//        **
//        *
        //by this we use decrement operator and also a nested loop and print only not println
     /*   int n=4;
        for (int i=n;i>0;i--){
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //ab isi problem ko ulta banao
        int k=4;
        for(int m=0;m<=k;m++){
            for (int a =0;a<m;a++){
                System.out.print("*");
            }
            System.out.print("\n");
        } */
        //write a program to sum the first n even  numbers hint=2n is for even numbers
       /* int sum =0;
        System.out.println("Enter your number for suming the First even numbers");
        Scanner sc =new Scanner(System.in);;
        int n =sc.nextInt();
        for (int i =0;i<n;i++){
         sum =sum+(2*i);
        }
            System.out.println("Sum of the"+n+"is :");
                 System.out.println(sum);

        */
        // now for printing Table problem no 3
       /* System.out.println("Enter your number For Your table");
        Scanner sc =new Scanner(System.in);;
        int n =sc.nextInt();
        for (int i =1;i<=10;i++){
            System.out.printf("%d X %d = %d \n",n,i,n*i);
        } */
        //now reverse that table
     /*  System.out.println("Enter your number For Your reverse table");
        Scanner sc =new Scanner(System.in);;
        int n =sc.nextInt();
        for (int i =10;i>=1;i--){
            System.out.printf("%d X %d = %d \n",n,i,n*i);
        }
 */
//now problem 6 finding answer of factorial of given number in while loops
        // 5! =5x4x3x2x1=120
      /*  System.out.println("Enter your number whhich sum of factoriial has to been shown");
        Scanner sc =new Scanner(System.in);;
        long n =sc.nextInt();
        long i = 1;
        long factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);*/

        //problem no 9
        //write the sum of all numbers in table has to be sum and show
        //8*1=8
        //8*2=16
        //sum =8+16=24-->that type of Program

        System.out.println("Enter your number For Your table sum");
        Scanner sc =new Scanner(System.in);;
        int n =sc.nextInt();
        int sum =0;
        for (int i =1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);



    }

}
