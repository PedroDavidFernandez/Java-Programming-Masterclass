package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

	    count = 1;
        while(true) {
            if (count == 4) {
                break;
            }
            System.out.println("** Count value is " + count);
            count++;
        }

        count = 6;
        do {
            System.out.println("^^ Count value was " + count);
            count++;

            if(count > 100) {
                System.out.println("breaking at 100");
                break;
            }

        } while (count != 6);

        //System.out.println(isEvenNumber(6));

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is: " + number);
        }
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
