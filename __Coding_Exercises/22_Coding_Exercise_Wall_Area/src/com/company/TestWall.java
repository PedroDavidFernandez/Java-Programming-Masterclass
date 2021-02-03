package com.company;

public class TestWall {
    public static void main(String[] args) {
        Wall wall = new Wall(4, 5);
        System.out.println("area " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        System.out.println("*** Area 2 ***");
        Wall wall2 = new Wall(-1.25, -1.25);

        System.out.println("width 2 = " + wall2.getWidth());
        System.out.println("height 2 = " + wall2.getHeight());
        System.out.println("area 2 = " + wall2.getArea());

        System.out.println("*** Area 3 ***");
        Wall wall3 = new Wall(1.125, -1.0);

        // wall3.setWidth(1.125);
        // wall3.setHeight(-1.0);
        System.out.println("width 3 = " + wall3.getWidth());
        System.out.println("height 3 = " + wall3.getHeight());
        System.out.println("area 3 = " + wall3.getArea());
    }
}
