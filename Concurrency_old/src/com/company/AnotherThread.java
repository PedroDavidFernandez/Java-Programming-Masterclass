package com.company;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            System.out.println(ThreadColor.ANSI_BLUE + "Before sleep...");
            Thread.sleep(6000);
            System.out.println(ThreadColor.ANSI_BLUE + "After sleep...");
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "Six seconds have passed and I'm awake");
    }
}
