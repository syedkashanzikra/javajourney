import java.sql.SQLOutput;
import java.util.Scanner;

public class CBSE_EXAM {
    public static void main(String[] args) {
        //Write A program to calculate percentage of a given student in CBSE Board Exam .HisMArks from subjects must be taken as input from  the keyboard
        //all subjects marks are out of 100
     String cBSE = "THIS IS THE CBSE PORTAL";
        System.out.println(cBSE);
        //For Maths
        System.out.println("Enter Your Maths Marks");
        Scanner maths =new Scanner(System.in);
        int mth = maths.nextInt();
        //For English
        System.out.println("Enter Your English Marks");
        Scanner eng =new Scanner(System.in);
        int english = eng.nextInt();
        //for Chemistry
        System.out.println("Enter Your Chemistry Marks");
        Scanner chem =new Scanner(System.in);
        int chemistry = chem.nextInt();
        //for Computer-science
        System.out.println("Enter Your Computer-science Marks");
        Scanner cs =new Scanner(System.in);
        int computer = cs.nextInt();
        //for Pakistan Studies
        System.out.println("Enter Your Pakistan Studies Marks");
        Scanner pst =new Scanner(System.in);
        int pakistan = pst.nextInt();
        //storing an calculating the value
        int percentage =((mth+english+chemistry+computer+pakistan)*100/500);
        System.out.println("Your Percentage Is: "+ percentage+"%" );
    }
}
