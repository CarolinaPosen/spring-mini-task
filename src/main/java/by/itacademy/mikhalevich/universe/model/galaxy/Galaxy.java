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
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@Component
@PropertySource({"classpath:galaxy.properties"})
public class Galaxy extends Entity {

    private BlackHole blackHole;

    @Autowired
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Map<String, BlackHole> holeMap;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Value("${galaxy.solar-system.black-hole}")
    private String blackHoleName;

    @Autowired
    @CustomClusterClassQualifier(clazz = StarClusterImpl.class)
    private Cluster cluster;

    public Galaxy(int id, String name, Cluster cluster) {
        super(id, name);
        this.cluster = cluster;
    }

    @PostConstruct
    public void start(){
        blackHole = holeMap.get(blackHoleName);
    }

    @PreDestroy
    public void finish(){

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Galaxy");
        sb.append(" name='").append(name).append("\n");
        sb.append("blackHole=").append(blackHole);
        sb.append(", cluster=").append(cluster);
        sb.append('}');
        return sb.toString();
    }
}
