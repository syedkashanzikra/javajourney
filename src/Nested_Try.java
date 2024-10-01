import java.util.Scanner;

public class Nested_Try {
    public static void main(String[] args) {
        int[] Marks ={25,2,3,56,36};
        boolean flag =true;
        while (flag){
        System.out.println("Input your number of array");
        Scanner sc = new Scanner(System.in);
        int ind =sc.nextInt();
        try{
            System.out.println("Welcome to our video");
  try{
      System.out.println(Marks[ind]);
        flag=false;

  }catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Sorry this your String is out of  Bond");
      System.out.println("Exception in level 1");

  }
        }catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
        System.out.println("Thankyou for using our Program !!");
    }
}
