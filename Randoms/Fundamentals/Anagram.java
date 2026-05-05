package Fundamentals;


import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        // If lengths differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to lowercase and char arrays
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        // Sort both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent")); // true
        System.out.println(isAnagram("Hello", "World"));   // false
    }
}