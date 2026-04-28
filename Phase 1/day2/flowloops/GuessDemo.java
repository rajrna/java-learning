// Use a while loop to keep asking the user to guess a secret number
//  (e.g. 42) until they get it right. 
// Print "Too high" or "Too low" as hints.
package day2.flowloops;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        Scanner sc = new Scanner(System.in);
        int guess=0;
        
        while (guess!=num) {
            System.out.println("Guess a number");
         guess = sc.nextInt();
          if(guess>num){
            System.out.println("TOO HIGH");
        }else if(guess<num){
            System.out.println("TOO LOW");
        }else{
            System.out.println("CORRECT");
        }

        }
        
        sc.close();

       



    }
    
}
