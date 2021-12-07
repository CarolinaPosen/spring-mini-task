package by.itacademy.mikhalevich.universe.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Galaxy {
    private String name;
    private List<StarSystem> starSystemList;
}
