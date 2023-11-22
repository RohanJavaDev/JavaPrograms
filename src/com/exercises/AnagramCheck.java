package com.exercises;
//Check if two strings are anagrams of each other

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen"; // First example string
        String str2 = "silent"; // Second example string

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams: " + isAnagram);
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings of different lengths cannot be anagrams
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
