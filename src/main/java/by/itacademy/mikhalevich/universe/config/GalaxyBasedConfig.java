package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.galaxy.Cluster;
import by.itacademy.mikhalevich.universe.model.galaxy.DarkMatterClusterImpl;
import by.itacademy.mikhalevich.universe.model.galaxy.Galaxy;
import by.itacademy.mikhalevich.universe.model.galaxy.StarClusterImpl;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({StarClusterConfig.class, DarkMatterClusterImpl.class})
public class GalaxyBasedConfig {

//    @Bean
//    public Galaxy galaxy(@CustomClusterClassQualifier(clazz = StarClusterImpl.class) Cluster cluster){
//        Galaxy galaxy = new Galaxy(1, "Milky Way", cluster);
//        return galaxy;
//    }

}
