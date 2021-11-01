package com.company.secondTake;

import static com.company.secondTake.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");

        // common mistake of calling run() directly, instead of start()
        anotherThread.run();

        new Thread() {
            public void run(){
                System.out.println(ANSI_GREEN +"Hello from the anonymous class thread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run");
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");

//        anotherThread.start(); -> this one will throw and exception


    }
}
