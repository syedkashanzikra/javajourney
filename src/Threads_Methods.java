class MyNewTh1 extends Thread {

    @Override
    public void run() {
//        int i =0;
        while (true){
            System.out.println("Thank you t1 ");
            //just write Thread.sleep it will auto compete it
            try {
                //it slows the speed
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            i++;
        }
    }
}
class MyNewTh2 extends Thread {

    @Override
    public void run() {
        int j =0;
        while (j<=15){
            System.out.println("Thank you t2  "+ getId());
            j++;
        }
    }
}











public class Threads_Methods {
    public static void main(String[] args) {

        MyNewTh1 t1 =new MyNewTh1();
        MyNewTh2 t2 =new MyNewTh2();

        t1.start();
        //if youuu want to execute first one thread than another we use obj.join
        //try catcch is a program that try but agar agar try katy andar ala error dega to exception chalegi
       /* try {

        t1.join();
        }catch (Exception e){
            System.out.println(e);
        }*/
        t2.start();




    }
}
