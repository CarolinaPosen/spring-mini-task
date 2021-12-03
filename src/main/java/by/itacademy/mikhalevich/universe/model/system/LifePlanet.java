package by.itacademy.mikhalevich.universe.model.system;

import by.itacademy.mikhalevich.universe.model.Entity;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import lombok.*;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("'").append(name).append("'\n");
        sb.append("lifeForm=").append(lifeForm);
        sb.append('\n');
        return sb.toString();
    }
}
