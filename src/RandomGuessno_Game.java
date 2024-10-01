import  java.util.Scanner;
import java.util.Random;

//class of game
class game{
    private int  computernumber; //computer number
    private int inputNumber; //user inputted number
    private int noOfGuesses =0; //no of Guesses

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }//getters and setters using alt+insert;
    game(){ //computer choice method
        Random r =new Random();
        this.computernumber=r.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Enter your Guessed Number");
        Scanner sc =new Scanner(System.in);
        inputNumber =sc.nextInt(); //the user choice is initiliazed here

    }
    boolean isCorrectNumber(){ //ye return value mangta hai to jab if true hojae to true return karana hota hai or else mein return false
        noOfGuesses ++; //bcs we have to show the no of guesses in ___ attemps
        if (inputNumber==computernumber){
            System.out.format("You Guessed the Write Number it was %d\n ,You guessed in %d attempts ",computernumber,noOfGuesses);
          return true;
        } else if (inputNumber>computernumber) {
            System.out.println("Too High ...");
        } else if (inputNumber<computernumber) {
            System.out.println("Too low..");

        }

            return false;


    }


}
public class RandomGuessno_Game {

       public static void main(String[] args) {


       /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

game g =new game();
boolean b =false;
           while (!b) { //!b is not B it checks b b is not true if
               // This is the beginning of a while loop. The loop will continue to execute as long as the condition !b is true, i.e., as long as b is false

         g.takeUserInput(); //method calling in loop wrna loop chlta rahega
       b= g.isCorrectNumber();//checking condition
           }
           }

       }




