package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.StarSystem;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlProperties {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans-with-properties.xml");
        ctx.registerShutdownHook();

        StarSystem unknownStarSystem = ctx.getBean("starSystem", StarSystem.class);
        unknownStarSystem.print();

    }
}
