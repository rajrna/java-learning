package Fundamentals;

import java.util.Scanner;

public class Recursive {

    public static int getFactorial(int num){

        if(num==0|| num==1){
            return 1;
        }
        return  num*getFactorial(num -1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int newNum = sc.nextInt();
        int result = getFactorial(newNum);
        System.out.println(result);
        sc.close();
    }
}
