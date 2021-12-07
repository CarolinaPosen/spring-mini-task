package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.StarSystem;
import by.itacademy.mikhalevich.universe.model.Universe;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlPropertiesAutowiring {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans-with-properties-autowiring.xml");
        ctx.registerShutdownHook();

        Universe universe = ctx.getBean("universe", Universe.class);
        universe.print();


    }
}
