package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Driver {
    private static final Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static final Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Saturn", 10.747);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 687.0);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Dheimos", 3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4331);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365.2);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Moon", 27.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Pluto", 90.560);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        // duplicated Pluto
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 97.560);
        solarSystem.put(pluto.getName(), pluto);
        planets.add(pluto);

        System.out.println("Solar system planets:");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.toString());
        }

        System.out.println("Moons of Mars:");
        HeavenlyBody body = solarSystem.get("Mars");
        for (HeavenlyBody moonsOfMars : body.getSatellites()) {
            System.out.println("\t" + moonsOfMars);
        }

        // test that pluto can be duplicated
        System.out.println(temp.equals(pluto));
        System.out.println(pluto.equals(temp));
    }
}
