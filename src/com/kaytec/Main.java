package com.kaytec;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        // SETS
        // no order enforced
        // no dups allowed
        // fast access

        //========================

        HeavenlyBody tempPlanet = new HeavenlyBody("Mercury", 88);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Venus", 225);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new HeavenlyBody("Earth", 365);
        solarSystem.put(tempPlanet.getName(), tempPlanet);
        planets.add(tempPlanet);

        HeavenlyBody tempMoon = new HeavenlyBody("The Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        HeavenlyBody venus = solarSystem.get("Venus");
        venus.addMoon(new HeavenlyBody("Arios", 27));
        venus.addMoon(new HeavenlyBody("Elia", 43));
        venus.addMoon(new HeavenlyBody("Anton", 11));

        HeavenlyBody mercury = solarSystem.get("Mercury");
        mercury.addMoon(new HeavenlyBody("Arios", 27));
        mercury.addMoon(new HeavenlyBody("Elia", 43));
        mercury.addMoon(new HeavenlyBody("Anton", 11));

        System.out.println("PLANETS:");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName());
        }

        // create a union of sets using add all
        Set<HeavenlyBody> allMoons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            allMoons.addAll(planet.getSatellites());
        }
        System.out.println();

        System.out.println("MOONS:");
        for(HeavenlyBody moon: allMoons) {
            System.out.println("\t" + moon.getName());
        }










    }
}
