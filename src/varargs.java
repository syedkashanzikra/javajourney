public class varargs {
  /*  static  int  sum(int x,int y){
        return x+y;
    }
    static  int  sum(int x,int y,int z){
        return x+y+z;
    }static  int  sum(int x,int y,int z,int k){
        return x+y+z+k;
    }
   */
    //stop using these .USe var args
    //In varargs the value is treat as an array and you have to make foreach  or for loop to make sum of them
    //for making it notnull you have to add one parameter more  //static int sum(int ...arr){
    static int sum(int x,int ...arr){
        int result=x;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //now by using var args u can put many values
        System.out.println(sum(45,56));
        System.out.println(sum(45,56,69));
        System.out.println(sum(45,56,69,96));
        System.out.println(sum(56,63,89,65,45,75));

    }
}
