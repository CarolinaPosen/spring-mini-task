package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.LifePlanet;
import by.itacademy.mikhalevich.universe.model.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.SolarSystem;
import lombok.Data;

import java.util.List;
import java.util.Map;

public class StartOldIoc {

    public static void main(String[] args) {
        NonLifePlanet mars = new NonLifePlanet(1, "Mars", true);
        NonLifePlanet mercury = new NonLifePlanet(2, "Mercury", false);
        NonLifePlanet venus = new NonLifePlanet(3, "Venus", false);

        LifePlanet earth = new LifePlanet(4, "Earth", Map.of("Human", 200, "Plants", 300, "Bacteria", 1000));

        SolarSystem solarSystem = new SolarSystem(5, "SolarSystem", "SLRSTM", earth, List.of(mars, mercury, venus));

        solarSystem.print();

    }

}
