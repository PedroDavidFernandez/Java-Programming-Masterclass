package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.run();

        System.out.println("Hello again from the main thread.");
    }
}
