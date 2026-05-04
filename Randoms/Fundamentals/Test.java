package Fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static String getMostFrequentWord(String sentence){

        String[] words = sentence.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for(String word: words){
            System.out.println(wordFrequency.get(word));
            if(wordFrequency.containsKey(word)){
                wordFrequency.put(word, wordFrequency.get(word)+1);
            }else{
                wordFrequency.put(word, 1);
            }
        }

        String frequentWord = "";
        int maxCount = 0;

        for(String word: wordFrequency.keySet()){
            if(wordFrequency.get(word)>maxCount){
                maxCount = wordFrequency.get(word);
                frequentWord = word;
            }
        }
        return frequentWord;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = getMostFrequentWord(sentence);
        System.out.println("The most frequent word is : "+result);
        sc.close();
    }


}
