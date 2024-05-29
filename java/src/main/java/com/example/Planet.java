package com.example;

public class Planet {
    private String name;
    private boolean hasRings;
    private int noOfMoons;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(int noOfMoons) {
        this.noOfMoons = noOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", hasRings=" + hasRings +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}
