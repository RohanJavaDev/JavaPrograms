package com.exercises;
//Find the first occurrence of a specific substring in a string

public class SubstringOccurrence {
    public static void main(String[] args) {
        String str = "Hello World"; // Example string
        String substring = "World"; // Substring to find

        int index = str.indexOf(substring);

        if (index != -1) {
            System.out.println("First occurrence of \"" + substring + "\" is at index: " + index);
        } else {
            System.out.println("Substring \"" + substring + "\" not found.");
        }
    }
}
