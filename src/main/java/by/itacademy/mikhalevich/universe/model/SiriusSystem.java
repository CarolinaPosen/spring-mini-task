package by.itacademy.mikhalevich.universe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class SiriusSystem extends Entity {
    private List<Integer> planets;

    public SiriusSystem(List<Integer> planets) {
        this.planets = planets;
    }

    public SiriusSystem(int id, String name, List<Integer> planets) {
        super(id, name);
        this.planets = planets;
    }
}
