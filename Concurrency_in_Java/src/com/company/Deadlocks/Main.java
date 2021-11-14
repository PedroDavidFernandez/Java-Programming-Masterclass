package com.company.Deadlocks;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
    }

    private static class ThreadOne extends Thread {
        public void run() {
            if (lock1.tryLock()) {
                try {
                    System.out.println("Thread One: Lock 1 obtained");
                    Thread.sleep(1000);
                    System.out.println("Thread One: Waiting for lock 2");
                } catch (InterruptedException e) {

                } finally {
                    System.out.println("Thread One: Unlock lock 1");
                    lock1.unlock();
                }
                if (lock2.tryLock()) {
                    try {
                        System.out.println("Thead One: lock 1 and lock 2 obtained");
                    } catch (Exception e) {

                    } finally {
                        System.out.println("Thread One: exiting lock 2");
                        lock2.unlock();
                    }
                }
            } else {
                System.out.println("Thread One: Waiting fot lock 2 to be available...");
            }
            System.out.println("Thread One: exiting lock 1");
        }
    }

    private static class ThreadTwo extends Thread {
        public void run() {
            if (lock2.tryLock()) {
                try {
                    System.out.println("Thread Two: Lock 2 obtained");
                    Thread.sleep(1000);
                    System.out.println("Thread Two: Waiting for lock 1");
                } catch (InterruptedException e) {

                } finally {
                    System.out.println("Thread Two: Unlock lock 2");
                    lock2.unlock();
                }
                if (lock1.tryLock()) {
                    try {
                        System.out.println("Thead Two: lock 2 and lock 1 obtained");
                    } catch (Exception e) {

                    } finally {
                        System.out.println("Thread Two: exiting lock 1");
                        lock1.unlock();
                    }
                }
            } else {
                System.out.println("Thread Two: Waiting fot lock 1 to be available...");
            }
            System.out.println("Thread Two: exiting lock 2");
        }
    }
}
