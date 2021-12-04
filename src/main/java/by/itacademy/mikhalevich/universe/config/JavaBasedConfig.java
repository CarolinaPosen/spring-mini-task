package by.itacademy.mikhalevich.universe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({GalaxyBasedConfig.class, StarClusterConfig.class})
public class JavaBasedConfig {

//    @Bean
//    public Galaxy galaxy(@Autowired StarCluster starCluster){
//        Galaxy galaxy = new Galaxy(1, "Milky Way", starCluster);
//        return galaxy;
//    }



}
