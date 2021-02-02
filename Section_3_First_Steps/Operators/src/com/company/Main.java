package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 -1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // Operand Abbreviations
        // result = result + 1
        result++;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;
        System.out.println("30 / 10 = " + result);

        // result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and smaller than top score");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = true;
        // It is preferable to use "!isCar" rathen than "isCar == false". Code is more concise and there is no risk of assignment
        if (isCar) {
            System.out.println("This is a car");
        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("was Car is true");
        }

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myResult = (myFirstDouble + mySecondDouble) * 100.00d;
        double remainder = myResult %  40.00d;
        System.out.println("the remainder is : " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("is Zero : " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder!");
        }
    }
}
