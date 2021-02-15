package arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        for (int i=0; i < integers.length; i++) {
            System.out.println("Element " + i + " Typed value was: " + integers[i]);
        }

        System.out.println("Average is: " + calculateAverage(integers));
    }

    private static int[] getIntegers(int numberOfIntegers) {
        System.out.println("Please enter 5 integers.");
        int[] values = new int[numberOfIntegers];
        for (int i=0; i < numberOfIntegers; i++) {
            values[i] += scanner.nextInt();
        }

        return values;
    }

    private static double calculateAverage(int[] array) {

        double total = 0;
        for(int i=0; i < array.length; i++) {
            total += array[i];
        }

        return (double) total / (double) array.length;
    }

}
