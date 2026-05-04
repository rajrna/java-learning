package Fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord {

    public static String findMostFrequentWord(String sentence){

        String[] words = sentence.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word: words){
            if (wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }else{
                wordCount.put(word, 1);
            }
        }

        String mostFrequent ="";
        int maxCount = 0;

        for(String word: wordCount.keySet()){
            if(wordCount.get(word) > maxCount){
                maxCount = wordCount.get(word);
                mostFrequent= word;
            }
        }

        return mostFrequent;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println("Enter your sentence: ");
        String frequentWord = findMostFrequentWord(sentence);
        System.out.println(frequentWord);
    }
}
