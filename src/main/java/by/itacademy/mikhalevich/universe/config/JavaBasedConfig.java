package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@PropertySource({"planet.properties"})
public class JavaBasedConfig {

    @Value("${earth.id}")
    private Integer earthId;
    @Value("${earth.name}")
    private String earthName;
    @Value("#{${earth.lifeForm}}")
    private Map<String, Integer> earthLifeForm;

    @Bean
    public LifePlanet earth(){
        LifePlanet earth = new LifePlanet(earthId, earthName);
        earth.setLifeForm(earthLifeForm);
        return earth;
    }

    @Bean
    public SyntheticLifePlanet teegarden(){
        SyntheticLifePlanet teegarden = new SyntheticLifePlanet(5, "Teegarden");
        teegarden.setMaterial("Carbon");
        teegarden.setLifeForm(Map.of("Silicon based life", 100, "Methanogens", 200, "Memetic life", 300));
        return teegarden;
    }

    @Bean
    public NonLifePlanet mars(@Value("${mars.id}") int id,  @Value("${mars.name}") String name, @Value("${mars.isColonization}") boolean isColonization){
        NonLifePlanet mars = new NonLifePlanet(id, name, isColonization);
        return mars;
    }

    @Bean
    public NonLifePlanet venus(){
        NonLifePlanet venus = new NonLifePlanet(3, "Venus", false);
        return venus;
    }

    @Bean
    public List<NonLifePlanet> nonLifePlanets(NonLifePlanet mars, NonLifePlanet venus){
        List<NonLifePlanet> nonLifePlanetsList = new ArrayList<>();
        nonLifePlanetsList.add(mars);
        nonLifePlanetsList.add(venus);
        return nonLifePlanetsList;
    }



    @Bean
    public StarSystem solarSystem(@CustomClassQualifier(clazz = SyntheticLifePlanet.class) LifePlanet lifePlanet, List<NonLifePlanet> nonLifePlanets){
        StarSystem solarSystem = new StarSystem(4, "Solar System", "SLRSSTM");
        solarSystem.setLifePlanet(lifePlanet);
        solarSystem.setNonLifePlanets(nonLifePlanets);
        return solarSystem;
    }

}
