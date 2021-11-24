package com.company;

public class Main {

    public static void main(String[] args) {
	    new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the anonymous class");
            }
        }).start();
    }
}

class CodeThreat implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}
