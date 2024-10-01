class MyTh1 extends Thread {
    MyTh1(String name){
        super(name); }

    @Override
    public void run() {
        int i =32;
while (true){

        System.out.println("Thank you  "+this.getName());
}
}
    }



public class thread_priorities {
    public static void main(String[] args) {


        MyTh1 t1 =new MyTh1("Kashan");
        MyTh1 t2 =new MyTh1("Kashan1");
        MyTh1 t3 =new MyTh1("Kashan2");
        MyTh1 t4 =new MyTh1("Kashan3");
        MyTh1 t5 =new MyTh1("Kashan4  (MOST IMPORTANT)");

t5.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.MIN_PRIORITY);
t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
