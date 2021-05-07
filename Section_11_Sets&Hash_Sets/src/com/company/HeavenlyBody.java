package com.company;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    enum BodyType {Planet, Moon, Star, DwarfPlanet};

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public boolean addSatellites(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if(this.name.equals(theObject.getName())) {
                return this.bodyType == theObject.bodyType;
            }
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.getName() + " is a HeavenlyBody of type " + this.getBodyType() +  " with "
                + " an orbital period of: " + this.getOrbitalPeriod();
    }
}
