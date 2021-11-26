package com.company;

public class Driver {
    public static void main(String[] args) {
        // "classic" Thread
        // "anonymous" Thread
        // lambda expression Thread
        // Collections sort example (Employee)
        // Collections sort example with lambda (Employee)

        Thread t1 = new Thread(new MegaThread());
        t1.start();
    }
}

class MegaThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am executing code from MegaThread");
    }
}
