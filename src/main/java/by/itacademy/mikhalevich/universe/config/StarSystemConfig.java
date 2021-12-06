package by.itacademy.mikhalevich.universe.config;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomStringQualifier;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import by.itacademy.mikhalevich.universe.model.system.NonLifePlanet;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import by.itacademy.mikhalevich.universe.model.system.SyntheticLifePlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Import({LifePlanetConfig.class, NonLifePlanetConfig.class})
public class StarSystemConfig {

    @Bean
    public List<StarSystem> starSystemList (StarSystem solarSystem, StarSystem siriusSystem){
        List<StarSystem> starSystems = new ArrayList<>();
        starSystems.add(solarSystem);
        starSystems.add(siriusSystem);
        return starSystems;
    }

    @Bean("solarSystem")
    public StarSystem solarSystem(@CustomClassQualifier(clazz = LifePlanet.class) LifePlanet lifePlanet, List<NonLifePlanet> nonLifePlanetList){
        StarSystem solarSystem = new StarSystem(200, "Solar System", "SLRSSTM");
        solarSystem.setLifePlanet(lifePlanet);
        solarSystem.setNonLifePlanets(nonLifePlanetList);
        return solarSystem;
    }

    @Bean("siriusSystem")
    public StarSystem siriusSystem(@CustomClassQualifier(clazz = SyntheticLifePlanet.class) LifePlanet lifePlanet){
        StarSystem siriusSystem = new StarSystem(100, "Sirius System", "SRSSSTM");
        siriusSystem.setLifePlanet(lifePlanet);
        return siriusSystem;
    }

    @Bean("herculesSystem")
    public StarSystem herculesSystem(NonLifePlanet tres4){
        StarSystem herculesSystem = new StarSystem(300, "Hercules System", "HRKLSSTM");
        return herculesSystem;
    }



}
