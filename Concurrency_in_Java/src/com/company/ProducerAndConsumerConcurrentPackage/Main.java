package com.company.ProducerAndConsumerConcurrentPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.company.ProducerAndConsumerConcurrentPackage.Main.EOF;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        MyProducer myProducer1 = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer myConsumer1 = new MyConsumer(buffer, ThreadColor.ANSI_RED);
        MyConsumer myConsumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);

        new Thread(myProducer1).start();
        new Thread(myConsumer1).start();
        new Thread(myConsumer2).start();
    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num: nums) {
            try {
                System.out.println(color + "Adding..." + num);
                synchronized (buffer) {
                    buffer.add(num);
                }

                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and existing...");
        synchronized (buffer) {
            buffer.add(EOF);
        }
    }
}

class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyConsumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        System.out.println(color + "MyConsumer run() method");
        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }

                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            }
        }
    }
}
