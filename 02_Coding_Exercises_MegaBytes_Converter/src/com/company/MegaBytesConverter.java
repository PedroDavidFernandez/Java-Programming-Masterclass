package com.company;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int remainder = kiloBytes % 1024;
        int megabytes = (kiloBytes - remainder) * 1024 / 1000000;

        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
    }
}
