package com.company;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the Lamba expression");
            System.out.println("Printing from the Lamba expression 2");
        }).start();

    }

}
