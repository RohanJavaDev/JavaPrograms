package com.weareforyou365.arrayexercise;
//Java program that rotates an array to the right by a given number of positions

public class ArrayRotation {

    public static void main(String[] args) {
        int[] originalArray = {6, 7, 8, 9, 10};
        int rotationCount = 2;

        int[] rotatedArray = rotateArrayRight(originalArray, rotationCount);

        System.out.println("Rotated Array: ");
        for (int value : rotatedArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] rotateArrayRight(int[] array, int rotationCount) {
        int arrayLength = array.length;
        int[] rotatedArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int rotatedIndex = (i + rotationCount) % arrayLength;
            rotatedArray[rotatedIndex] = array[i];
        }

        return rotatedArray;
    }
}


