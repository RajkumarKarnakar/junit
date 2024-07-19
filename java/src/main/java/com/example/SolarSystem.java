package com.example;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    public static List<Planet> getPlanets(){
        List<Planet> planets = new ArrayList<>();
        Planet mercury = new Planet("mercury");
        mercury.setHasRings(false);
        mercury.setNoOfMoons(0);
        planets.add(mercury);

        Planet venus = new Planet("venus");
        venus.setHasRings(false);
        venus.setNoOfMoons(0);
        planets.add(venus);

        Planet mars = new Planet("mars");
        mars.setHasRings(false);
        mars.setNoOfMoons(1);
        planets.add(mars);

        Planet earth = new Planet("earth");
        earth.setHasRings(false);
        earth.setNoOfMoons(1);
        planets.add(earth);

        Planet jupiter = new Planet("jupiter");
        jupiter.setHasRings(true);
        jupiter.setNoOfMoons(100);
        planets.add(jupiter);

        Planet saturn = new Planet("saturn");
        saturn.setHasRings(true);
        saturn.setNoOfMoons(120);
        planets.add(saturn);

        return planets;
    }
}
