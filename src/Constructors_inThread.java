class MyTh extends Thread {
    MyTh(String name){
          super(name); //name fuction predefined hota hai thread mein
    }
    //run method lagana zarori  hai

    @Override
    public void run() {
        int i =32;
//while (true){
//
//        System.out.println("Thank you !");
//}
    }
}

public class Constructors_inThread {
    public static void main(String[] args) {
        MyTh t1 =new MyTh("Kashan");
        MyTh t2 =new MyTh("Asghar");

        t1.start();
        t2.start();
        System.out.println("Your name of"+t1.getName() );
        System.out.println("Your Id of"+t1.getId() );
        System.out.println("Your name of"+t2.getName() );
        System.out.println("Your Id of"+t2.getId() );


    }
}
