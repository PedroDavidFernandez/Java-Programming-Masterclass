package com.company.ThreadStarvation;

public class Main {
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColor.BLUE_BOLD), "Priority 1");
        Thread t2 = new Thread(new Worker(ThreadColor.CYAN_BOLD), "Priority 2");
        Thread t3 = new Thread(new Worker(ThreadColor.GREEN_BOLD), "Priority 3");
        Thread t4 = new Thread(new Worker(ThreadColor.PURPLE_BOLD), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.YELLOW_BRIGHT), "Priority 5");

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
            synchronized (lock) {
                for (int i=0; i<100; i++) {
                    System.out.format(
                            threadColor + "%s:count runner %d\n", Thread.currentThread().getName(), ++countRunner);
                }
            }
        }
    }
}
