package by.itacademy.mikhalevich.universe.model.galaxy;

import by.itacademy.mikhalevich.universe.model.Entity;
import by.itacademy.mikhalevich.universe.model.qualifiers.CustomClusterClassQualifier;
import by.itacademy.mikhalevich.universe.model.system.StarSystem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@CustomClusterClassQualifier(clazz = DarkMatterClusterImpl.class)
@Component
@PropertySource({"classpath:cluster.properties"})
public class DarkMatterClusterImpl extends Entity implements Cluster {

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
