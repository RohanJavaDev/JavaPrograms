package com.exercises;
//Count the number of vowels and consonants in a given string.

public class VowelsConsonantsCount {
    public static void main(String[] args) {
        String str = "Example String"; // Example string
        int vowelCount = 0, consonantCount = 0;

        // Converting the string to lower case to make the comparison case-insensitive
        String lowerCaseStr = str.toLowerCase();

        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char ch = lowerCaseStr.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    // Vowel found
                    vowelCount++;
                } else {
                    // Consonant found
                    consonantCount++;
                }
            }
        }

        System.out.println("String: " + str);
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);
    }
}