package day2.flowloops;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean prime=true;
       
        if(num<=1){
            prime=false;
        }else{
            for(int i=2; i<num;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }


        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}
