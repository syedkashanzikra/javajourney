import java.util.Arrays;

public class NewArrays {
    public static void main(String[] args) {
        //today we talk about the arrays there are only three methods to  make arrays
        //first one
     /*   int[] marks;
        marks =new  int[5];
       */
        int[] marks = new int[5];
        marks[0] = 56;
        marks[1] = 26;
        marks[2] = 36;
        marks[3] = 586;
        marks[4] = 6;
        System.out.println(marks[1]);

        //and the third method which is direct
        String[] students = {"Kashan", "Abbas", "Naqvi", "Syed"};
        System.out.println(students[0]);
        System.out.println(students.length);

        //now for printing ull array using for loop
       /* for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        } */
        //now for printing all array in reverse using for loop
        for (int i = students.length - 1; i >= 0; i--) {
            System.out.println(students[i]);
        }
        //for printing the array we can also  use Foreach loops
        //this is for int
        //in this loop we assign for(string m-->our new variable:marks-->means our array)
        for (int m : marks) {
            System.out.println(m);
        }
        //this is for string
        for (String sts : students) {
            System.out.println((sts));
        }
    }
}


