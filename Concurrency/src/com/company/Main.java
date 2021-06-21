package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

//        anotherThread.run(); -> never call the run method directly, otherwise it will execute the main Thread
//        use start() method instead

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class Thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from the anonymous class's implementation of run()");
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();
        
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main Thread");

        // anotherThread.start(); -> this will create an IllegalThreadStateException since instance cannot be reused

    }
}
