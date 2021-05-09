package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    enum BodyTypes {Planet, Moon, Star, DwarfPlanet};

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes BodyTypes) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, BodyTypes);
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellites(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public static Key makeKey(String name, BodyTypes BodyTypes) {
        return new Key(name, BodyTypes);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + " is a HeavenlyBody of type " + this.key.getBodyTypes() +  " with "
                + " an orbital period of: " + this.orbitalPeriod;
    }

    public static final class Key {
        private final String name;
        private final BodyTypes BodyTypes;

        private Key(String name, BodyTypes BodyTypes) {
            this.name = name;
            this.BodyTypes = BodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return BodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.BodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key theObject = (Key) obj;
            if (this.name.equals(theObject.getName())) {
                return this.BodyTypes == theObject.getBodyTypes();
            }
            return false;
        }
    }
}
