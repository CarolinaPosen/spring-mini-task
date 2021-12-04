package by.itacademy.mikhalevich.universe.model.galaxy;

import by.itacademy.mikhalevich.universe.model.Entity;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@CustomClusterClassQualifier(clazz = DarkMatterClusterImpl.class)
@Component
@PropertySource("classpath:galaxy.properties")
public class DarkMatterClusterImpl extends Entity implements Cluster {

    @Value("${cluster.dark.percentage}")
    private Integer substancesPercentage;

    public DarkMatterClusterImpl(Integer substancesPercentage) {
        this.substancesPercentage = substancesPercentage;
    }

    public DarkMatterClusterImpl(int id, String name, Integer substancesPercentage) {
        super(id, name);
        this.substancesPercentage = substancesPercentage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DarkMatterCluster\n");
        sb.append(", name='").append(name).append("\n");
        sb.append("substancesPercentage=").append(substancesPercentage);
        sb.append("\n");
        return sb.toString();
    }
}
