package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXml {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ctx.registerShutdownHook();
//        LifePlanet lp = (LifePlanet) ctx.getBean("earth");
//        lp.print();

//        SolarSystem solarSystem = ctx.getBean("solarSystem", SolarSystem.class);
//        solarSystem.print();

        StarSystem unknownStarSystem = ctx.getBean("unknownStarSystem", StarSystem.class);
        unknownStarSystem.print();

    }
}
