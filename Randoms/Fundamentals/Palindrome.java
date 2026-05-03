package Fundamentals;

import java.util.Scanner;

// Write a method that takes an integer
// and returns true if it's a palindrome
public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while(num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }

        if(original==reverse){
            System.out.println("The number" + original + "is a palindrome");
        }else{
            System.out.println("The number " + original + " is not a palindrome");
        }



    }
}
