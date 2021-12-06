package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomStringQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@PropertySource({"classpath:planet.properties"})
public class NonLifePlanetConfig {

    @Bean("nonLifePlanetList")
    public List<NonLifePlanet> nonLifePlanets(NonLifePlanet mars, NonLifePlanet venus){
        List<NonLifePlanet> nonLifePlanetsList = new ArrayList<>();
        nonLifePlanetsList.add(mars);
        nonLifePlanetsList.add(venus);
        return nonLifePlanetsList;
    }

    @CustomStringQualifier(name = "mars")
    @Bean
    public NonLifePlanet mars(@Value("${mars.id}") int id,  @Value("${mars.name}") String name, @Value("${mars.isColonization}") boolean isColonization){
        NonLifePlanet mars = new NonLifePlanet(id, name, isColonization);
        return mars;
    }
    @CustomStringQualifier(name = "venus")
    @Bean
    public NonLifePlanet venus(){
        NonLifePlanet venus = new NonLifePlanet(3, "Venus", false);
        return venus;
    }

    @CustomStringQualifier(name = "jupiter")
    @Bean
    public NonLifePlanet jupiter(){
        NonLifePlanet jupiter = new NonLifePlanet(4, "Jupiter", false);
        return jupiter;
    }

    @Bean("nonLifePlanetTres4")
    public List<NonLifePlanet> nonLifePlanets2(NonLifePlanet tres4){
        List<NonLifePlanet> nonLifePlanetsList = new ArrayList<>();
        nonLifePlanetsList.add(tres4);
        return nonLifePlanetsList;
    }

    @Qualifier("tres4")
    @Bean
    public NonLifePlanet tres4(){
        NonLifePlanet tres4 = new NonLifePlanet(5, "TrES-4", false);
        return tres4;
    }

}
