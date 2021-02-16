package com.company;

import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] integers = getIntegers(5);
        int[] sortedArray = sortIntegers(integers);
        printArray(sortedArray);
    }

    private static void printArray(int[] sortedArray) {
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Element " + i + " content " + sortedArray[i]);
        }
    }

    private static int[] sortIntegers(int[] integers) {
        int[] unsortedArray = new int[integers.length];
        for (int i=0; i < integers.length; i++) {
            unsortedArray[i] = integers[i];
        }

        boolean flag = true;
        while(flag) {
            flag = false;
            int temp;
            for (int i=0; i<unsortedArray.length; i++) {
                for (int j=0; j<unsortedArray.length; j++) {
                    if (unsortedArray[i] > unsortedArray[j]) {
                        temp = unsortedArray[i];
                        unsortedArray[i] = unsortedArray[j];
                        unsortedArray[j] = temp;
                    }
                }
            }
        }
        return unsortedArray;
    }

    private static int[] getIntegers(int numberOfIntegers) {
        System.out.println("Please enter " + numberOfIntegers + " integers");
        int[] arrayOfIntegers = new int[numberOfIntegers];
        for (int i=0; i<numberOfIntegers; i++) {
            arrayOfIntegers[i] = scanner.nextInt();
        }

        return arrayOfIntegers;
    }
}
