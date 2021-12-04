package by.itacademy.mikhalevich.universe.model.galaxy;


import by.itacademy.mikhalevich.universe.model.Entity;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
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
@PropertySource({"classpath:galaxy.properties", "classpath:black-hole.properties"})
public class Galaxy extends Entity {

    @Autowired
    @Value("#{blackHole}")
    private BlackHole blackHole;

    @Autowired
    @CustomClusterClassQualifier(clazz = DarkMatterClusterImpl.class)
    private Cluster cluster;

    public Galaxy(int id, String name, Cluster cluster) {
        super(id, name);
        this.cluster = cluster;
    }
}
