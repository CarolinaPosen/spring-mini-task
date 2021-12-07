package by.itacademy.mikhalevich.universe.model;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.EarthQualifier;
import by.itacademy.mikhalevich.universe.model.qualifiers.TeegardenQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class StarSystem extends Entity {

    private String alias;

    @Autowired
//    @TeegardenQualifier
    @CustomClassQualifier(clazz = SyntheticLifePlanet.class)
    private LifePlanet lifePlanet;
    private List<NonLifePlanet> nonLifePlanets;

    public StarSystem(int id, String name, String alias) {
        super(id, name);
        this.alias = alias;
    }

    public StarSystem(int id, String name, String alias, LifePlanet lifePlanet) {
        super(id, name);
        this.alias = alias;
        this.lifePlanet = lifePlanet;
    }

    public StarSystem(int id, String name, String alias, LifePlanet lifePlanet, List<NonLifePlanet> nonLifePlanets) {
        super(id, name);
        this.alias = alias;
        this.lifePlanet = lifePlanet;
        this.nonLifePlanets = nonLifePlanets;
    }

//    public void start(){
//        System.out.println("SolarSystem " + alias + " has been created");
//    }
//
//    public void finish(){
//        System.out.println("SolarSystem " + alias + " has been finished");
//    }

}
