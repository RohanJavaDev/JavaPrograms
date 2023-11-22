package com.exercises;
//Check if a given string is a palindrome or not.

public class PalindromeCheck {
	
    public static void main(String[] args) {
        String str = "Radar"; 
        String cleaned = str.toLowerCase().replaceAll("[\\s+\\p{Punct}]", ""); 

        boolean isPalindrome = isPalindrome(cleaned);
        System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome);
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
                
            }
            
            i++;
            j--;
        }
        return true;
    }
}