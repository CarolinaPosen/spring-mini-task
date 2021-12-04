package by.itacademy.mikhalevich.universe.model.galaxy;

import by.itacademy.mikhalevich.universe.model.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString(callSuper = true)
@Data
@NoArgsConstructor
@Component("black")
public class BlackHole {
    private int id;
    private String name;
    private int weight;

    public BlackHole(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
}
