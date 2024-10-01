class Runnable1 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<=25;i++){

            System.out.println("I am not a threat ,I am thread1 and myy number is " + i);

        }
    }
}
class Runnable2 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<=25;i++){

            System.out.println("I am not a threat ,I am thread2 and myy number is " + i);

        }
    }
}

public class Runnablethread {
    public static void main(String[] args) {
   //for using runnable implemetion we have to use a method
        Runnable1 bullet1 =new Runnable1();
        Thread gun1 =new Thread(bullet1);

        Runnable2 bullet2 =new Runnable2();
        Thread gun2 =new Thread(bullet2);
 gun1.start();
 gun2.start();

    }
}
