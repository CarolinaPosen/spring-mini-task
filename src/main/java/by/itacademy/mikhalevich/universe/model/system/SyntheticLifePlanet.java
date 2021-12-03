package by.itacademy.mikhalevich.universe.model.system;

import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClassQualifier;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@CustomClassQualifier(clazz = SyntheticLifePlanet.class)
public class SyntheticLifePlanet extends LifePlanet {

    private String material;
    private Map<String, Integer> lifeForm;

    public SyntheticLifePlanet(int id, String name) {
        super(id, name);
    }

    public SyntheticLifePlanet(int id, String name, Map<String, Integer> lifeForm) {
        super(id, name);
        this.lifeForm = lifeForm;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("'").append(name).append("'\n");
        sb.append("material='").append(material).append("'\n");
        sb.append("lifeForm=").append(lifeForm);
        sb.append('\n');
        return sb.toString();
    }
}
