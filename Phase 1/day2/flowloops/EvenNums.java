package day2.flowloops;

import java.util.Scanner;

public class EvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Numbers:\n");
        for(int i=0; i<=num; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
