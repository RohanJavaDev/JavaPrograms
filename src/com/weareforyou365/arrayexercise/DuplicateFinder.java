package com.weareforyou365.arrayexercise;
//Java program to find and return duplicate elements in an array.

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 4, 5, 4, 6}; // Example array
        Set<Integer> duplicates = findDuplicates(array);

        System.out.println("Duplicate elements: " + duplicates);
    }

    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();

        for (int num : array) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return duplicates;
    }
}

