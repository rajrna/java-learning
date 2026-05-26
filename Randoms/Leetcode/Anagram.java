package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = s.charAt(i);

            count.put(charS, count.getOrDefault(charS,0)+1);
            count.put(charT, count.getOrDefault(charT, 0)-1);
        }

        for(int val: count.values()){
            if (val != 0) return false;
        }
        return true;
    }
}
