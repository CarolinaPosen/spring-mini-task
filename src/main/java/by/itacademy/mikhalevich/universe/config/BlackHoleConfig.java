package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.galaxy.BlackHole;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

@Configuration
@PropertySource("classpath:black-hole.properties")
public class BlackHoleConfig {

    @Value("${black.id}")
    private Integer id;
    @Value("${black.name}")
    private String name;
    @Value("${black.weight}")
    private int weigth;

    @Bean
    public BlackHole blackHole() {
        BlackHole blackHole = new BlackHole(id, name, weigth);
        return blackHole;
    }


}
