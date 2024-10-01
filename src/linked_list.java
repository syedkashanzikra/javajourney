import  java.util.*;
public class linked_list {
    public static void main(String[] args) {

        //in this we got many methods for arrays
        //first  we have to declare one
        //it hass some alag methods from arraylist
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();

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

        //the other methods in Linked List are
        l1.addLast(455);
        l1.addFirst(555);
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
