package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.galaxy.DarkMatterClusterImpl;
import by.itacademy.mikhalevich.universe.model.galaxy.StarClusterImpl;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
public class DarkMatterClusterConfig {

//    @Bean
//    public DarkMatterClusterImpl darkMatterCluster(){
//        DarkMatterClusterImpl darkMatterCluster = new DarkMatterClusterImpl(200, "DarkMatter000", 55);
//        return darkMatterCluster;
//    }

}