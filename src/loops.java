import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
    /*    int i = 1;
        while(i<=3){
            System.out.println("Enter Your Name");
            Scanner sc =new Scanner(System.in);
            String nm = sc.next();
            String name =nm.toLowerCase();
            if (name.equals("kashan") || name.equals("abbas")){
                System.out.println("Hello World");
            }else {
                System.out.println("HEy!");
            }
            i++;
            System.out.println("You are Welcome");

        } */
        //Write A program for printing 100 to 200
/*
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;

        } */

        //Write A program With do while loop
        //In this loop first loop executes and then checks condition

       /* int i=0;
        do {
            System.out.println(i);
            i++;
        }while (i<=25);
*/
        //Write a Program in for loop
        //for(intilization;condition;increment/decrement)
        //write a program in which user write to get n numbers of even or odd numbers
//for even
  /*      System.out.println("Write How MAny Even numbers do you want");
  Scanner evn =new Scanner(System.in);
  int even= evn.nextInt();
  //the Logic behind an even number is 2n means 2*n=0,2,6,8
        for(int n =0;n<even;n++){
            System.out.println(2*n);
        }
        //for odd
        System.out.println("Write How MAny Odd numbers do you want");
        Scanner od =new Scanner(System.in);
        int odd= od.nextInt();
        //the Logic behind an odd number is 2n means 2*n+1=1,3,7,9
        for(int m =0;m<odd;m++){
            System.out.println(2*m+1);
        }
        //for Printing Table
        System.out.println("Write Your Number which is multiplied 10 times");
        Scanner sc =new Scanner(System.in);
        int tbl_num = sc.nextInt();
    for(int j =1;j<=10;j++){
        System.out.println(tbl_num+"x"+j+"="+tbl_num*j);
    } */
    //Decrement operator in for
        System.out.println("enter your number which wil be decreased to 0");
        Scanner decr =new Scanner(System.in);
    int decrese = decr.nextInt();
        for (int k=decrese;k>=0;k--){
            System.out.println(k);
        }

    }

}
