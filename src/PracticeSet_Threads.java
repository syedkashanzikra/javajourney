//problem  1 and problem  no 2
class Message extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<=5){

            System.out.println("Hello ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }
                System.out.println("GO0D MORNING");
            i++;
        }
    }
}
class Problem3a extends Thread{
    @Override
    public void run() {
        System.out.println("I have more Priority");
    }
}
class Problem3b extends Thread{
    @Override
    public void run() {
        System.out.println("I have less Priority");
    }
}


public class PracticeSet_Threads {
    public static void main(String[] args) {
  Message m1 =new Message();
//  m1.start();
  Problem3a p1  =new Problem3a();
  Problem3b p2  =new Problem3b();

  p1.setPriority(9);
  p2.setPriority(2);

        System.out.println( p1.getPriority());
        System.out.println( p2.getPriority());
//
//  p1.start();
//  p2.start();

        //how to know state of givenn class

        System.out.println( p1.getState());

        p1.start();
        System.out.println( p1.getState());
        //for getting state formula

        System.out.println("Hello");
        System.out.println(Thread.currentThread().getState());

    }
}
