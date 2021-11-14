package com.company.Deadlocks;

public class Main {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
    }

    private static class ThreadOne extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread One: Lock 1 obtained");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread One: Waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thead One: lock 1 and lock 2 obtained");
                }
                System.out.println("Thread One: exiting lock 2");
            }
            System.out.println("Thread One: exiting lock 1");
        }
    }

    private static class ThreadTwo extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread Two: Lock 2 obtained");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread Two: Waiting for lock 1");
                synchronized (lock1) {
                    System.out.println("Thead Two: lock 2 and lock 1 obtained");
                }
                System.out.println("Thread One: exiting lock 1");
            }
            System.out.println("Thread One: exiting lock 2");
        }
    }
}
