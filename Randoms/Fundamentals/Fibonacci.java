package Fundamentals;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number: ");
        int range = sc.nextInt();

        int first = 0;
        int second = 1;

        if(range >= 1){
            System.out.println(first);
        }
        if(range >= 2){
            System.out.println(second);
        }

        for(int i=1;i<=range; i++){

            int num = first + second;
            System.out.println(num);
            first = second;
            second = num;
        }
        sc.close();
    }
}
