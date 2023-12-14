package com.weareforyou365.arrayexercise;
// Implement an algorithm to shuffle the elements of an array randomly

import java.util.Random;

public class ArrayShuffler {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        shuffleArray(array);

        System.out.println("Shuffled Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Simple swap
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}



