package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class PlanetTest {
    private List<Planet> planets;
    private PlanetUtils planetUtils;

    @Before
    public void setUp() throws Exception {
        planetUtils = new PlanetUtils();
        planets = SolarSystem.getPlanets();
    }

    @Test
    public void testTwoPlanetsStartWithM() {
        List<Planet> actual = planetUtils.getPlanetBeginningWithM(planets);
        assertThat(actual).hasSize(2); // Assert size using AssertJ
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("mercury", "mars"); // Existing AssertJ assertion
    }

    @Test
    public void testTwoPlanetsHaveRings() {
        List<Planet> actual = planetUtils.getPlanetWithRings(planets);
        assertThat(actual).hasSize(2);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("jupiter", "saturn");

    }

    @Test
    public void getTwoPlanetWithNoMoon() {
        List<Planet> actual = planetUtils.getPlanetsWithNoMoon(planets);
        assertThat(actual).hasSize(2);
        assertThat(actual).extracting(Planet::getName)
                .containsExactly("mercury", "venus");
    }
}










