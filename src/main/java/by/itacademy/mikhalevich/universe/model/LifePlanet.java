package by.itacademy.mikhalevich.universe.model;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class LifePlanet extends Entity {

    private List<Integer> lifeForm;

    public LifePlanet(int id, String name, List<Integer> lifeForm) {
        super(id, name);
        this.lifeForm = lifeForm;
    }
}
