package by.itacademy.mikhalevich.universe.model.system;

import by.itacademy.mikhalevich.universe.model.Entity;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class StarSystem extends Entity {

    private String alias;

//    @Autowired
//    @TeegardenQualifier
//    @CustomClassQualifier(clazz = SyntheticLifePlanet.class)
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

    public void start(){
        System.out.println("SolarSystem " + alias + " has been created");
    }

    public void finish(){
        System.out.println("SolarSystem " + alias + " has been finished");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n");
        sb.append("name='").append(name).append("'\n");
        sb.append("alias='").append(alias).append("'\n");
        sb.append("lifePlanet=").append(lifePlanet);
        sb.append("nonLifePlanets=").append(nonLifePlanets);
        sb.append('\n');
        return sb.toString();
    }
}
