package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Map;

public class JavaBasedConfig {

    public LifePlanet earth(){
        LifePlanet earth = new LifePlanet(1, "Earth");
        earth.setLifeForm(Map.of("Human", 100, "Plants", 200, "Bactery", 300));
        return earth;
    }

    public NonLifePlanet mars(){
        NonLifePlanet mars = new NonLifePlanet(2, "Mars", true);
        return mars;
    }

    public NonLifePlanet venus(){
        NonLifePlanet venus = new NonLifePlanet(3, "Venus", false);
        return venus;
    }

    @Bean
    public StarSystem solarSystem(){
        StarSystem solarSystem = new StarSystem(4, "Solar System", "SLRSSTM");
        solarSystem.setLifePlanet(earth());
        solarSystem.setNonLifePlanets(List.of(mars(), venus()));
        return solarSystem;
    }

}
