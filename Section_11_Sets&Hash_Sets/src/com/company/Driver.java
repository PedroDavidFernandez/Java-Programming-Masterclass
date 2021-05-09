package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Driver {
    private static final Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static final Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Saturn", 10.747);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Mars", 687.0);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Dheimos", 3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        tempMoon = new Moon("Phobos", 1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new Planet("Jupiter", 4331);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365.2);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Moon", 27.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellites(tempMoon);

        temp = new Planet("Pluto", 90.560);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // duplicated Pluto
        HeavenlyBody pluto = new DwarfPlanet("Pluto", 97.560);
        solarSystem.put(pluto.getKey(), pluto);
        planets.add(pluto);

        System.out.println("Solar system planets:");
        for (HeavenlyBody planet : planets) {
                System.out.println("\t" + planet.toString());
        }

        System.out.println("Moons of Mars:");
        HeavenlyBody body = solarSystem.get(
                HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));
        System.out.println(body.getKey());

        // test that pluto can be duplicated
        System.out.println(temp.equals(pluto));
        System.out.println(pluto.equals(temp));
    }
}
