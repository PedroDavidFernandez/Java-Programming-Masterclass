package com.company;

public class Main {

    public static void main(String[] args) {
	    new Thread(new CodeThreat()).start();
    }
}

class CodeThreat implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}
