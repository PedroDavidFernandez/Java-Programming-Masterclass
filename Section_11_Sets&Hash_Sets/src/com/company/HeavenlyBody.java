package com.company;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public enum BodyTypes {STAR, PLANET, MOON, DWARF_PLANET};

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.orbitalPeriod = orbitalPeriod;
        this.key = new Key(name, bodyTypes);

        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellites(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public static Key makeKey(String name, BodyTypes bodyTypes) {
        return new Key(name, bodyTypes);
    }

    @Override
    public String toString() {
        return "Planet " + this.key.getName() + " => " + this.orbitalPeriod;
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            Key key = ( (HeavenlyBody) obj).getKey();
            return this.key.equals(key);
        }

        return false;
    }

    public static final class Key {
        public final String name;
        public final BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HeavenlyBody) {
                String theObjectName = ((Key) obj). getName();
                if (this.name.equals(theObjectName)) {
                    return this.bodyTypes == ((Key) obj).getBodyTypes();
                }
            }

            return false;
        }
    }
}
