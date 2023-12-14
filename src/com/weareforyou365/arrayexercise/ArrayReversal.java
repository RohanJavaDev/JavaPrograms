package com.weareforyou365.arrayexercise;

//Java program that includes a function to reverse the elements in an array

public class ArrayReversal {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Changed example array
        reverseArray(array);

        System.out.println("Reversed Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the indices towards the middle
            start++;
            end--;
        }
    }
}

