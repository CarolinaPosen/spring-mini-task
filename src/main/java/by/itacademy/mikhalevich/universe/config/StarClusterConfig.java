package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.galaxy.DarkMatterClusterImpl;
import by.itacademy.mikhalevich.universe.model.galaxy.StarClusterImpl;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@Import({StarSystemConfig.class})
public class StarClusterConfig {

    @CustomClusterClassQualifier(clazz = StarClusterImpl.class)
    @Bean
    public StarClusterImpl starClusterImpl(StarSystem solarSystem, StarSystem siriusSystem){
        StarClusterImpl starCluster = new StarClusterImpl(100, "starCluster001");
        starCluster.setStarSystemList(List.of(solarSystem, siriusSystem));
        return starCluster;
    }


}