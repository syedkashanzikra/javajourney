import  java.util.*;

public class Array_List {
    public static void main(String[] args) {
        //in this we got many methods for arrays
        //first  we have to declare one
        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>();
        l1.add(12);
        l1.add(13);
        l1.add(52);
        l1.add(32);
        l1.add(0 ,62);
        l1.add(0 ,12);
        l2.add(5);
        l2.add(1);
        l2.add(6);
        l2.add(5);
//We can also an array into the array
        l1.addAll(l2);
        //for clearing all data
//        l1.clear();
        //for checking that the value is in the array?

        System.out.println( l1.contains(27));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));

        //for printing we also get two methods
        for (int i =0;i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }


    }
}
