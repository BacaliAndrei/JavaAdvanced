package ro.sda.advanced._9_enum;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    static Set<HeavenlyBody> planets = new HashSet<>();
    static Set<HeavenlyBody> stars = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody mercury = new Planet("Mercury",88);
        solarSystem.put(mercury.getKey(),mercury);
        planets.add(mercury);

        HeavenlyBody earth = new Planet("earth",365);
        solarSystem.put(earth.getKey(),earth);
        planets.add(earth);

        HeavenlyBody earthMoon = new Moon("Moon",27);
        solarSystem.put(earthMoon.getKey(),earthMoon);
        earth.addSatellite(earthMoon);

        HeavenlyBody temp4 = new Planet("Jupiter", 4380);
        solarSystem.put(temp4.getKey(), temp4);
        planets.add(temp4);

        // moons of jupiter
        HeavenlyBody tempMoon2 = new Moon("Europa", 3.6);
        solarSystem.put(tempMoon2.getKey(), tempMoon2);
        temp4.addSatellite(tempMoon2);

        HeavenlyBody tempMoon3 = new Moon("Callisto", 17);
        solarSystem.put(tempMoon3.getKey(), tempMoon3);
        temp4.addSatellite(tempMoon3);

        Star tempStar = new Star("Sun", 0);
        solarSystem.put(tempStar.getKey(), tempStar);
        stars.add(tempStar);

        System.out.println("Planets");
        for (var planet:planets){
            System.out.println(planet);
        }
        System.out.println("------------------------");

        System.out.println("Stars");
        for (var star:stars){
            System.out.println(star);
        }
        System.out.println("------------------------");

        Set<HeavenlyBody>moons=new HashSet<>();
        for (var planet:planets){
            moons.addAll(planet.getSatelliteSet());
        }
        for (var moon:moons){
            System.out.println(moon);
        }
    }
}
