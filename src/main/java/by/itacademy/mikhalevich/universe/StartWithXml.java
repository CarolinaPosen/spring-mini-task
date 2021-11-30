package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.LifePlanet;
import by.itacademy.mikhalevich.universe.model.SolarSystem;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        LifePlanet lp = (LifePlanet) ctx.getBean("earth");
//        lp.print();

        SolarSystem solarSystem = ctx.getBean("solarSystem", SolarSystem.class);
        solarSystem.print();

    }
}
