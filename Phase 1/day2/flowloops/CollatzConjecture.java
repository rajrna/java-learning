package day2.flowloops;

import java.util.Scanner;

// Collatz conjecture — 
// start with any positive integer n. 
// If it's even, divide by 2; 
// if it's odd, multiply by 3 and 
// add 1. 
// Repeat until you reach 1. 
// Count and print the number of steps
public class CollatzConjecture {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int count =0;
    while(num!=1){
        if(num%2 ==0){
            num=num/2;
            count++;
        }else{
            num = (num*3)+1;
            count++;
        }
    }
    System.out.println(count);
    sc.close();
   } 
}
