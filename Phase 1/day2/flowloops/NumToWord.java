package day2.flowloops;

import java.util.Scanner;

public class NumToWord {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number between 1 and 99");
            int num = sc.nextInt();

            if(num<1 || num>99){
                System.out.println("Invalid number. Enter between 1 and 99");
            }else{
                String word ="";

                if(num<=19){
                    if (num == 1) word = "one";
                    else if (num == 2) word = "two";
                    else if (num == 3) word = "three";
                    else if (num == 4) word = "four";
                    else if (num == 5) word = "five";
                    else if (num == 6) word = "six";
                    else if (num == 7) word = "seven";
                    else if (num == 8) word = "eight";
                    else if (num == 9) word = "nine";
                    else if (num == 10) word = "ten";
                    else if (num == 11) word = "eleven";
                    else if (num == 12) word = "twelve";
                    else if (num == 13) word = "thirteen";
                    else if (num == 14) word = "fourteen";
                    else if (num == 15) word = "fifteen";
                    else if (num == 16) word = "sixteen";
                    else if (num == 17) word = "seventeen";
                    else if (num == 18) word = "eighteen";
                    else if (num == 19) word = "nineteen";
                }else{
                    int tens = num/10;
                    int ones = num%10;

                    if(tens == 2) word = "twenty";
                    else if (tens == 3) word = "thirty";
                    else if (tens == 4) word = "forty";
                    else if (tens == 5) word = "fifty";
                    else if (tens == 6) word = "sixty";
                    else if (tens == 7) word = "seventy";
                    else if (tens == 8) word = "eighty";
                    else if (tens == 9) word = "ninety";

                    if(ones != 0){
                        word += "-";

                        if(ones==1) word+= "one";
                        else if (ones == 2) word += "two";
                        else if (ones == 3) word += "three";
                        else if (ones == 4) word += "four";
                        else if (ones == 5) word += "five";
                        else if (ones == 6) word += "six";
                        else if (ones == 7) word += "seven";
                        else if (ones == 8) word += "eight";
                        else if (ones == 9) word += "nine";
                    }
                }

                System.out.println("Your number: "+ word);
                break;
            }
        }
        sc.close();
    }
}
