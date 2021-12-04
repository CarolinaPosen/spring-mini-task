package by.itacademy.mikhalevich.universe.model.galaxy;


import by.itacademy.mikhalevich.universe.model.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@Component
@PropertySource({"classpath:galaxy.properties"})
public class Galaxy extends Entity {

    @Value("${galaxy.solar-system.black-hole}")
    private String blackHole;

    @Autowired
    private StarCluster starCluster;

    public Galaxy(int id, String name, StarCluster starCluster) {
        super(id, name);
        this.starCluster = starCluster;
    }
}
