package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@Import({LifePlanetConfig.class, NonLifePlanetConfig.class})
public class GalaxyBasedConfig {

    @Bean
    public StarSystem solarSystem(@CustomClassQualifier(clazz = SyntheticLifePlanet.class) LifePlanet lifePlanet, List<NonLifePlanet> nonLifePlanets){
        StarSystem solarSystem = new StarSystem(4, "Solar System", "SLRSSTM");
        solarSystem.setLifePlanet(lifePlanet);
        solarSystem.setNonLifePlanets(nonLifePlanets);
        return solarSystem;
    }

}
