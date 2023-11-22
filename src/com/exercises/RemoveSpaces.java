package com.exercises;
//Remove all white spaces from a string.

public class RemoveSpaces {
    public static void main(String[] args) {
        String originalString = "Java Programming Language"; 
        String stringWithoutSpaces = originalString.replaceAll("\\s+", "");

        System.out.println("Original String: " + originalString);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}