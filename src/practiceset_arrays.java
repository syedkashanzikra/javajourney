import java.util.Scanner;

public class practiceset_arrays {
    public static void main(String[] args) {
        //create an array and print sum of them
       /* float sum=0;
        int[] marks ={56.5f,85.5f,89.3f,65.0f,55.2f};
        for (int i =0;i< marks.length;i++){
        sum=sum+marks[i];
        }
            System.out.println(sum); */
        //write a program that given  number is in the array or not
     /*  float[] marks ={56.5f,85.5f,89.3f,65.0f,55.2f};
        float n=56.6f;
       boolean isinarray =false;
        for (float element:marks) {
            if(n==element){
               isinarray=true;
                break;
            }

        }
        if (isinarray){

            System.out.println("Your number is present in array");
        }
            else {
            System.out.println("Your number is not present in array  !!");
        }
*/
        //problem 3
/*
        float sum=0;
        float[] marks ={56.5f,85.5f,89.3f,65.0f,55.2f};
        for (int i =0;i< marks.length;i++){
            sum=sum+marks[i];
        }
        System.out.println("The average number of the students in physics test are : "+sum/ marks.length);


        */
     //problm 4
        /*
        int[][] mat1={{4,8,9},
                    {2,14,18}};         //look like a matrices with 2 col and 3 rows
        int[][] mat2={{1,5,9},
                    {12,5,7}};         //look like a matrices with 2 col and 3 rows
        int[][] result={{0,0,0},
                       {0,0,0}};         //look like a matrices with 2 col and 3 rows

  for (int i=0;i< mat1.length;i++){    //row number of times
      for (int j=0;j<mat1[i].length;j++){ //coloumn number of times

          System.out.format("Setting value for i=%d and j=%d \n ",i,j);
          result[i][j]=mat1[i][j]+mat2[i][j];
      }
  }
  */

  //for printing result like a matrix

      /*  for (int i=0;i< mat1.length;i++){    //row number of times

            for (int j=0;j<mat1[i].length;j++){ //coloumn number of times

                System.out.print(result[i][j] +" ");
                result[i][j]=mat1[i][j]+mat2[i][j];
            }

            System.out.println(" ");
        } */
//problem reverse the array in simple code
/*
        int[] reverse= {8,6,5,63,7};
for (int i = reverse.length -1;i>=0;i--){
    System.out.println(reverse[i]);
}*/
  //problem check min value in array
  /*      int min =0;
        int[] arr= {8,6,5,63,7};
     //in this we use foreach loop
        for (int m:arr){
            if (m>min){
                min=m;
            }
        }
            System.out.println(min);*/
   //now for max
     /*   int max =0;
        int[] arr= {1,8,6,5,63,7};
        for (int m:arr){
            if (m>max){
                max =m;
            }
        }
        System.out.println(max);*/

//for getting max value
        // your int max =MIN_VALUE;
        //for getting min value
        //your int min =MAX_VALUE;

        //problem no 7 write program that checks that array is sorted
        boolean is_Sorted =true;
        // int[] arr= {1,8,6,5,63,7};//not sorted array
        int[] arr= {1,3,5,6,63,72};// sorted array

        for (int i =0;i< arr.length-1;i++){
            if (arr[i] >arr[i+1]){
                is_Sorted =false;
                break;
            }
        }if (is_Sorted){
            System.out.println("Your array is sorted");
        }else {
            System.out.println("Your array is not sorted");
        }



    }

}


