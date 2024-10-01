public class breakandcontinue {
    public static void main(String[] args) {
        //Break is the statement is for making the loop break and execute after loop
  //for Example
    for(int i =0;i<=5;i++){
        System.out.println(i);
        System.out.println("Hello Loop ");
      if (i==2){
          System.out.println("Break the loop");
          break;
      }
        }
    //now continue statement is used for skip that iteration only
        for(int j =0;j<=25;j++){
        if(j==2){
            System.out.println("Skip the Iteration  of " + j);
        }
            System.out.println(j);
        }

    }
}



