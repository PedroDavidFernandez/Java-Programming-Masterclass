package challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // implement the following methods getIntegers(), printArray(), sortIntegers()

        int[] array = getIntegers(3);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i +1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                }
            }
        }
        return sortedArray;
    }

    /*private static int[] sortIntegers(int[] array) {
        int temp;
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }*/
    private static void printArray(int[] integers) {
        System.out.println("Values from array: ");
        for(int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }
    }

    private static int[] getIntegers(int numberOfIntegers) {
        System.out.println("Please enter " + numberOfIntegers + " integers.");
        int[] integers = new int[numberOfIntegers];
        for (int i=0; i < numberOfIntegers; i++) {
            integers[i] +=  scanner.nextInt();
        }

        return integers;
    }
}
