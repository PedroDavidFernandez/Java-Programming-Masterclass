package com.inheritance.challenge.pool_area;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (length < 0 && width < 0) {
            this.length = 0;
            this.width = 0;
            return;
        }
        if (width < 0) {
            this.width = 0;
            this.length = length;
            return;
        }
        if (length < 0) {
            this.length = 0;
            this.width = width;
            return;
        }

        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return getLength() * getWidth();
    }
}
