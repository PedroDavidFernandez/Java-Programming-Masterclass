package com.company;

public class Main {

    public static void main(String[] args) {
        CountdownThread countdownThread1 = new CountdownThread(new Countdown());
        countdownThread1.setName("Thread 1");

        CountdownThread countdownThread2 = new CountdownThread(new Countdown());
        countdownThread2.setName("Thread 2");

        countdownThread1.start();
        countdownThread2.start();
    }
}

class Countdown {
    String color;
    public void doCountdown() {
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_GREEN;
                break;
            default:
                System.out.println(ThreadColor.ANSI_RED + "This is not a current thread!");
        }

        for (int i=10; i>=0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": " + i);
        }
    }
}

class CountdownThread extends Thread {
    Countdown countdown;

    public CountdownThread(Countdown countdown) {
        this.countdown = countdown;
    }

    public void run() {
        this.countdown.doCountdown();
    }
}