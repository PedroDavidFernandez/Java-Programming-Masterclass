package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println("^^ mini challenge 1 ^^");
        // using the for statement, call the calculateInterest method with the amount of 100000 with an
        // interest rate of 2,3,4,5,6,7 and 8 and print the result in the console window.

        for (int i=2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        System.out.println("^^ mini challenge 2 ^^");
        // How would you modify the for loop above to do the same thing as shown but to start from
        // 8% and work back to 2%

        for (int i=8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("^^ final challenge ^^");
        int count = 0;
        for (int i=10; i < 50; i++) {
            if (isPrime(i)) {
                count ++;
                System.out.println(i);
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i<= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
