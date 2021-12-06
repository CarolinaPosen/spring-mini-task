package by.itacademy.mikhalevich.universe.model.qualifiers;

import by.itacademy.mikhalevich.universe.model.galaxy.Cluster;
import by.itacademy.mikhalevich.universe.model.system.LifePlanet;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
public @interface CustomClusterClassQualifier {
    Class<? extends Cluster> clazz();
}
