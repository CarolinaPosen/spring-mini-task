package by.itacademy.mikhalevich.universe.model.galaxy;


import by.itacademy.mikhalevich.universe.model.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class Galaxy extends Entity {

    private StarCluster starCluster;

    public Galaxy(int id, String name, StarCluster starCluster) {
        super(id, name);
        this.starCluster = starCluster;
    }
}
