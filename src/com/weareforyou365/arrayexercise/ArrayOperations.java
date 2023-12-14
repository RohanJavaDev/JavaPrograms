package com.weareforyou365.arrayexercise;

//Java program to find the intersection and union of two arrays:

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] intersection = findIntersection(array1, array2);
        int[] union = findUnion(array1, array2);

        System.out.println("Intersection: " + Arrays.toString(intersection));
        System.out.println("Union: " + Arrays.toString(union));
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        int[] intersection = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    intersection[index] = i;
                    index++;
                    break;
                }
            }
        }

        return Arrays.copyOf(intersection, index);
    }

    public static int[] findUnion(int[] array1, int[] array2) {
        int[] union = new int[array1.length + array2.length];
        int index = 0;

        for (int i : array1) {
            union[index] = i;
            index++;
        }

        for (int i : array2) {
            boolean isDuplicate = false;

            for (int j : array1) {
                if (i == j) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                union[index] = i;
                index++;
            }
        }

        return Arrays.copyOf(union, index);
    }
}