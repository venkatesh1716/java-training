package com.trimindtech.training.home03;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet p = new Planet("mars",120);

        p.printPlanet();
        p.calculateAge(25);
    }
}
