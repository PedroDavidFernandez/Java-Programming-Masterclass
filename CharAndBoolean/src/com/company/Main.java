package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'P';
        char myUnicodeChar = '\u0050';
        char mySecondUnicodeChar = '\u01C4';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(mySecondUnicodeChar);

        boolean isCustomerOver21 = true;
        if (isCustomerOver21) {
            System.out.println("Customer is over 21");
        }
    }
}
