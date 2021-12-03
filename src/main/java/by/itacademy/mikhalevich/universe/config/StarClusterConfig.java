package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.galaxy.StarCluster;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@Import({StarSystemConfig.class})
public class StarClusterConfig {

    @Bean
    public StarCluster starCluster(@Autowired StarSystem solarSystem, @Autowired StarSystem siriusSystem){
        StarCluster starCluster = new StarCluster(100, "starCluster001");
        starCluster.setStarSystemList(List.of(solarSystem, siriusSystem));
        return starCluster;
    }

}