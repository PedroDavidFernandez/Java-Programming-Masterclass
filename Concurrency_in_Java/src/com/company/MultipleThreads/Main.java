package com.company.MultipleThreads;

public class Main {
    public static void main(String[] args) {
        Countdown countdown1 = new Countdown();
        Countdown countdown2 = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown1);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown2);
        t1.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {
    private int i;
    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_RED;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_GREEN;
                break;
            default:
                color = ThreadColor.ANSI_CYAN;
        }

        for (i=10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threatCountdown;

    public CountdownThread(Countdown countdown) {
        this.threatCountdown = countdown;
    }

    public void run() {
        this.threatCountdown.doCountdown();
    }
}
