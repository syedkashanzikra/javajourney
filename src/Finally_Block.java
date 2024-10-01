public class Finally_Block {
    public static void test(){
        try {
            int c= 2+2;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("A loop which divides 2 by one by one");
        }
        for (double i=0;i<=5;i++){

try{

            System.out.println(2/i);
}catch (Exception e){
    System.out.println(e);
}

        }

    }
   public static int greet(){

       try {
           int a=50;
           int b=0;
           return a/b;
       }catch (Exception e){
           System.out.println(e);
       }
       //finally block  always run always ..
       finally {
           System.out.println("Cleaning and Booting up the Program................");
       }
       return 0;
   }
    public static void main(String[] args) {
 int k =greet();
        System.out.println(k);
        test();
    }
}
