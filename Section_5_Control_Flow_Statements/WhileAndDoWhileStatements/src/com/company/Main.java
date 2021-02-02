package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            sum++;

            if (count > 5) {
                break;
            }

            System.out.println("Even number is: " + number);
            System.out.println("total number of even numbers: " + sum);
            //System.out.println("count is " + count);
        }

        // modify the code above
        // make it also to record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end display the total number of even numbers found
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
