package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.StarSystem;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlPropertiesAutowiring {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans-with-properties-autowiring.xml");
        ctx.registerShutdownHook();

        StarSystem solarSystem = ctx.getBean("solarSystem", StarSystem.class);
        solarSystem.print();


    }
}
