package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyTypes;

    public enum BodyTypes {STAR, PLANET, MOON, DWARF_PLANET};
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyTypes = bodyTypes;

        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getOrbitalType() {
        return bodyTypes;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellites(HeavenlyBody moon) {
        return this.satellites.add(moon);
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            if (this.name.equals(((HeavenlyBody) obj).getName())) {
                return this.bodyTypes == ((HeavenlyBody) obj).bodyTypes;
            }
        }

        return false;
    }
}
