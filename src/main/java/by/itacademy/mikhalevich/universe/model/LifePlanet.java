package by.itacademy.mikhalevich.universe.model;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import lombok.*;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@CustomClassQualifier(clazz = LifePlanet.class)
public class LifePlanet extends Entity {

    private Map<String, Integer> lifeForm;

    public LifePlanet(int id, String name) {
        super(id, name);
    }

    public LifePlanet(int id, String name, Map<String, Integer> lifeForm) {
        super(id, name);
        this.lifeForm = lifeForm;
    }

}
