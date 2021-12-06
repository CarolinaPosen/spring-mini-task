package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.galaxy.Cluster;
import by.itacademy.mikhalevich.universe.model.galaxy.DarkMatterClusterImpl;
import by.itacademy.mikhalevich.universe.model.galaxy.Galaxy;
import by.itacademy.mikhalevich.universe.model.galaxy.StarClusterImpl;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomStringQualifier;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@Import({StarClusterConfig.class})
public class GalaxyBasedConfig {

//    @Bean
//    public Galaxy galaxy(@CustomClusterClassQualifier(clazz = StarClusterImpl.class) Cluster cluster){
//        Galaxy galaxy = new Galaxy(1, "Milky Way", cluster);
//        return galaxy;
//    }

//    @Bean("galaxies")
//    public List<Galaxy> galaxies(@Qualifier("solarSystem") Galaxy solarSystem){
//        List<Galaxy> galaxies = new ArrayList<>();
//        galaxies.add(solarSystem);
//        return galaxies;
//    }

}
