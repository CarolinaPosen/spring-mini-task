package by.itacademy.mikhalevich.universe.model.galaxy;

import by.itacademy.mikhalevich.universe.model.Entity;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class StarCluster extends Entity {

    private List<StarSystem> starSystemList;

    public StarCluster(int id, String name) {
        super(id, name);
    }

    public StarCluster(int id, String name, List<StarSystem> starSystemList) {
        super(id, name);
        this.starSystemList = starSystemList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StarCluster\n");
        sb.append("starSystemList=").append(starSystemList);
        sb.append('\n');
        return sb.toString();
    }
}
