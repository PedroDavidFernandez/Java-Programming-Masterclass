package com.company.ThreadStarvation;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColor.BLUE_BOLD), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColor.CYAN_BOLD), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColor.GREEN_BOLD), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColor.PURPLE_BOLD), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.YELLOW_BRIGHT), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static class Worker implements Runnable{
        private String threadColor;
        private int countRunner = 0;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i=0; i<100; i++) {
                lock.lock();
                try {
                    System.out.format(
                            threadColor + "%s:count runner %d\n", Thread.currentThread().getName(), ++countRunner);

                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
