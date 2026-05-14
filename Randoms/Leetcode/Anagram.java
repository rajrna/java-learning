package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);


        }
        return true;
    }
}
