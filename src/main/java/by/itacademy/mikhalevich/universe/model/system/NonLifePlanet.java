package by.itacademy.mikhalevich.universe.model.system;

import by.itacademy.mikhalevich.universe.model.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class NonLifePlanet extends Entity {

    private boolean isColonization;

    public NonLifePlanet(int id, String name, boolean isColonization) {
        super(id, name);
        this.isColonization = isColonization;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("isColonization=").append(isColonization);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
