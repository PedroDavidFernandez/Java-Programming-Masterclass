package com.company.secondTake;

import static com.company.secondTake.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(ANSI_BLUE + "Another Thread wake me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I am awake");
    }
}
