

/* 

Create a class Game, which allows a user to play " Guess the Number" once
1. Constructor to generate the random number
2. takeUserInput() to take a user input of number
3. isCorrectNumber() to detect whether the number entered by the user is true
4. getter and setter for noOfGuesses
Use properties such as noOfGuessses(int), etc to get this task done!

*/

import java.util.Random;
import java.util.Scanner;

class Game{

    public int number;
    public int inputNumber;
    public int noOfGuessses;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100); // cause I need value from 0 to 100
    }

    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        if (inputNumber==number){
            return true;
        }
        else if(inputNumber>number)
        {
            System.out.print("Too High!");
        }
        else if(inputNumber<number)
        {
            System.out.print("Too low");
        }
        return false;

    }


    public void setNoOfGuessses(int noOfGuessses){
       this.noOfGuessses = noOfGuessses;
    }
    public int getNoOfGuessses(){
        
        return noOfGuessses;

    }
}
public class Harryguessdgame {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while(!b){
            
        g.takeUserInput();
        b = g.isCorrectNumber();
     
        }
    }
    
}
