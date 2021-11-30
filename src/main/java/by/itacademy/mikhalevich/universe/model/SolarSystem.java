package by.itacademy.mikhalevich.universe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class SolarSystem extends Entity {

    private String alias;

    private LifePlanet lifePlanet;
    private List<NonLifePlanet> nonLifePlanets;

    public SolarSystem(int id, String name, String alias, LifePlanet lifePlanet, List<NonLifePlanet> nonLifePlanets) {
        super(id, name);
        this.alias = alias;
        this.lifePlanet = lifePlanet;
        this.nonLifePlanets = nonLifePlanets;
    }
}
