package challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // implement the following methods getIntegers(), printArray(), sortIntegers()

        int[] array = getIntegers(2);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    private static int[] sortIntegers(int[] array) {
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
    }

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
