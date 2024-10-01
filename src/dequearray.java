import java.util.*;

public class dequearray {
    public static void main(String[] args) {
   ArrayDeque<Integer> ad1 =new ArrayDeque<>();
   ad1.add(55);
   ad1.add(4);//add is default addLast  
   ad1.addFirst(554);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
