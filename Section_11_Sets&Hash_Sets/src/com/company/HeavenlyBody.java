package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;

    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;

        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public void addMoon(HeavenlyBody moon) {
        this.satellites.add(moon);
    }

    @Override
    public String toString() {
        return "Planet " + this.name + " => " + this.orbitalPeriod;
    }

    @Override
    public int hashCode() {
        System.out.println(this.name + " hashcode: " + (this.name.hashCode() + 57));
        return this.name.hashCode() + 57;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String theOjectName = ( (HeavenlyBody) obj).getName();
        return this.name.equals(theOjectName);
    }
}
