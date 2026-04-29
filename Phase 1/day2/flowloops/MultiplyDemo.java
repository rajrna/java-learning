package day2.flowloops;

import java.util.Scanner;

// Print the multiplication table 
// (1–10) for any number the user inputs.
public class MultiplyDemo {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number : ");
   int num = sc.nextInt();
   for(int i=1;i<=10;i++){
    System.out.println(num+"*"+i +"="+ num*i);
   }
   sc.close();
}    
}
