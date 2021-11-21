package com.company.test.multipleThreads;

public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThreat t1 = new CountdownThreat(countdown);
        t1.setName("Thread 1");

        CountdownThreat t2 = new CountdownThreat(countdown);
        t2.setName("Thread 2");

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
                color = ThreadColor.BLACK_BRIGHT;
                break;
            case "Thread 2":
                color = ThreadColor.WHITE_BRIGHT;
                break;
            default:
                color = ThreadColor.GREEN_BRIGHT;
        }

        for (i=10; i>0; i--){
            System.out.println(color + Thread.currentThread().getName() + " i : " + i);
        }
    }
}

class CountdownThreat extends Thread {
    private Countdown threadCountdown;

    public CountdownThreat(Countdown countdown) {
        this.threadCountdown = countdown;
    }

    public void run(){
        this.threadCountdown.doCountdown();
    }
}
