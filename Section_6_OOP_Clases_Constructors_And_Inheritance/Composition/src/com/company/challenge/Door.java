package com.company.challenge;

public class Door {
    private double height;
    private double width;

    public Door() {
    }

    public Door(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void open() {
        System.out.println("Door.open()");
    }

    public void close() {
        System.out.println("Door.close()");
    }
}
