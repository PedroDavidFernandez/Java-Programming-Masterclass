package com.company;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.Planet);
    }

    @Override
    public boolean addSatellites(HeavenlyBody moon) {
        if (moon.getBodyType() == BodyType.Moon) {
            return super.addSatellites(moon);
        }
        return false;
    }
}
