package by.itacademy.mikhalevich.universe.model;
import by.itacademy.mikhalevich.universe.model.galaxy.Galaxy;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.Proxy;
import java.util.List;

@Data
@NoArgsConstructor
@Component
public class Universe implements Printable{

    private List<Galaxy> galaxies;

    @Autowired
    public void setGalaxies(List<Galaxy> galaxies) {
        galaxies.get(0).setName("Milky Way");
        this.galaxies = galaxies;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(galaxies);
        sb.append('\n');
        return sb.toString();
    }
}
