package com.company;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.Planet);
    }

    @Override
    public boolean addSatellites(HeavenlyBody moon) {
        if (moon instanceof Moon) {
            super.addSatellites(moon);
        }
        return false;
    }
}
