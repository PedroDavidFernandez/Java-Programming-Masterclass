package com.inner;

import java.util.ArrayList;

public class GearBoxTest {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIn;

    public GearBoxTest(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    // operate Clutch (boolean parameter)
    public void operateClutch(boolean in) {
        this.clutchIn = in;
    }

    // addGear - receives 2 parameters (number, ratio) - validate number
    public void addGear(int number, double ratio) {
        if ((number>0) && (number<=maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    // changeGear
    public void changeGear(int newGear) {
        if ((newGear>=0) && (newGear<this.gears.size()) && this.clutchIn) {
            System.out.println("New Gear " + newGear + " selected.");
            this.currentGear = newGear;
        } else {
            System.out.println("Grind!!");
            this.currentGear = 0;
        }
    }

    // wheel speed
    public double wheelSpeed(int revs) {
        if (clutchIn) {
            System.out.println("Scream");
            return 0.0;
        }
        return revs * (gears.get(currentGear).getRatio());
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
