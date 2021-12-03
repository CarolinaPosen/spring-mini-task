package by.itacademy.mikhalevich.universe;

import by.itacademy.mikhalevich.universe.config.JavaBasedConfig;
import by.itacademy.mikhalevich.universe.model.galaxy.Galaxy;
import by.itacademy.mikhalevich.universe.model.galaxy.StarCluster;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithJavaBasedConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext("by.itacademy.mikhalevich.universe");
        ctx.registerShutdownHook();

        Galaxy galaxy = ctx.getBean("galaxy", Galaxy.class);
        galaxy.print();
    }

}
