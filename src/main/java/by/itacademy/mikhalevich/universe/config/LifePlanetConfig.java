package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomStringQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@PropertySource("classpath:planet.properties")
public class LifePlanetConfig {

    @Value("${earth.id}")
    private Integer earthId;
    @Value("${earth.name}")
    private String earthName;
    @Value("#{${earth.lifeForm}}")
    private Map<String, Integer> earthLifeForm;

    @CustomClassQualifier(clazz = LifePlanet.class)
//    @CustomStringQualifier(name = "earth")
    @Bean
    public LifePlanet earth() {
        LifePlanet earth = new LifePlanet(earthId, earthName);
        earth.setLifeForm(earthLifeForm);
        return earth;
    }

    @CustomClassQualifier(clazz = SyntheticLifePlanet.class)
//    @CustomStringQualifier(name = "tgrn")
    @Bean
    public SyntheticLifePlanet teegarden() {
        SyntheticLifePlanet teegarden = new SyntheticLifePlanet(5, "Teegarden");
        teegarden.setMaterial("Carbon");
        teegarden.setLifeForm(Map.of("Silicon based life", 100, "Methanogens", 200, "Memetic life", 300));
        return teegarden;
    }

}
