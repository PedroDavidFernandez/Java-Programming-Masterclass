package com.company;

public class LambdasTest2 {
    public static void main(String[] args) {
        new Thread(){
            public void run() {
                System.out.println("Running from the anonymous class");
            }
        }.start();
    }
}

class MyOwnThread implements Runnable{
    @Override
    public void run() {
        System.out.println("I am running from " + getClass().getName());
    }
}
