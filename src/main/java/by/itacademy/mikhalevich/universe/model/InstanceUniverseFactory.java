package by.itacademy.mikhalevich.universe.model;

import java.util.List;

public class InstanceUniverseFactory {

    public Universe createInstance(List<Galaxy> galaxies){
        return new Universe(galaxies);
    }

}
