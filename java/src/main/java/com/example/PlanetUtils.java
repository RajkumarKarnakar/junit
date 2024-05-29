package com.example;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {

    public List<Planet> getPlanetBeginningWithM(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getName().startsWith("m"))
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithNoMoon(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getNoOfMoons()==0)
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getNoOfMoons()>3)
                .collect(Collectors.toList());
    }

    public List<Planet> getPlanetWithRings(List<Planet> planets){
        return planets.stream()
                .filter(Planet::isHasRings)
                .collect(Collectors.toList());
    }
}
