package com.weareforyou365.arrayexercise;
//Java program that includes functions to find the maximum and minimum elements in an array of number

public class MaxMinFinder {

    public static void main(String[] args) {
        int[] array = {42, 35, 89, 3, 77, 21, 99}; 

        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

