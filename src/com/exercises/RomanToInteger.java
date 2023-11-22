package com.exercises;
// Program which accepts Roman Number and converts it into Integer
public class RomanToInteger {

    public static void main(String[] args) {
        String s = "MCMIV"; // Changed value

        System.out.println("After converting roman number: " + romanConverter(s));
    }

    public static int romanConverter(String s) {
        int num = 0, currentValue = 0, previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);

            switch (currentSymbol) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }
            if (currentValue < previousValue) {
                num -= currentValue;
            } else {
                num += currentValue;
            }
            previousValue = currentValue;
        }
        return num;
    }

    public RomanToInteger() {
    }
}


