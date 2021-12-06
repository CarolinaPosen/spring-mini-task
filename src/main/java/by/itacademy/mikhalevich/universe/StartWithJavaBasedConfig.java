package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.model.Universe;
import by.itacademy.mikhalevich.universe.model.galaxy.Galaxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithJavaBasedConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext("by.itacademy.mikhalevich.universe");
        ctx.registerShutdownHook();

        Universe universe = ctx.getBean("universe", Universe.class);
        universe.print();
    }

}
