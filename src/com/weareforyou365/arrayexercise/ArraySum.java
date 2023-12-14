package com.weareforyou365.arrayexercise;
//Java program to calculate the sum of all elements in an array of integers:

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

