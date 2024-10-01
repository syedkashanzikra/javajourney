class Mythread1 extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println("This is MYThread1 I am Cooking");
            System.out.println("I am Happy");
        }

    }

}
class Mythread2 extends Thread{

    @Override
    public void run(){
        while (true){

            System.out.println("This is MYThread2 I am Talking at home");
            System.out.println("I am SAd");
        }
    }

}

public class MultiThreading {
    public static void main(String[] args) {
   Mythread1 t1 =new Mythread1();
   Mythread2 t2 =new Mythread2();

   t1.start();
   t2.start();

    }
}
