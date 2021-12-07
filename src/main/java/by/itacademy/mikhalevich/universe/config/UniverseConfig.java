package by.itacademy.mikhalevich.universe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({GalaxyConfig.class})
public class UniverseConfig {


}
