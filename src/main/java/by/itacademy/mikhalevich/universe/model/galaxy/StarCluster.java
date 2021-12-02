package by.itacademy.mikhalevich.universe.model.galaxy;

import by.itacademy.mikhalevich.universe.model.Entity;

import java.util.List;

public class StarCluster extends Entity {
    private int countOfStars;

    public StarCluster(int id, String name, int countOfStars) {
        super(id, name);
        this.countOfStars = countOfStars;
    }
}
