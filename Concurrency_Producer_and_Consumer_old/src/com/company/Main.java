package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        System.out.println("** I am the read **");
        System.out.println("empty var equals to -> " + empty);

        while (empty) {
            try {
                wait();
                System.out.println("I have been waiting on the read() => " + message);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        System.out.println("** I am the writer **");
        System.out.println("empty var equals to -> " + empty);
        while (!empty) {
            try {
                wait();
                System.out.println("I have been waiting on the write() => " + message);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
            "Humpty Dumpty sat on a wall",
            "Humpty Dumpty had a great fall",
            "All the king's horses and all the king's men",
            "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for (int i=0; i< messages.length; i++) {
            message.write(messages[i]);
            try {
                int sleep = random.nextInt(2000);
                System.out.println("WRITER SLEEP VALUE => " + sleep);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();

        for (String latestMessage = message.read(); !latestMessage.equals("Finished");
             latestMessage = message.read()) {
            System.out.println("***** LATEST MESSAGE *****\n " + latestMessage);
            try {
                int sleep = random.nextInt(2000);
                System.out.println("READER SLEEP VALUE => " + sleep);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}