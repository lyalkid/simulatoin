package ru.simulation;
import ru.simulation.entity.Entity;

import java.util.HashMap;
public class Map {
    private HashMap<Cell, Entity> map;

    public Map(HashMap<Cell, Entity> map) {
        this.map = map;
    }

    public HashMap<Cell, Entity> getMap() {
        return map;
    }

    public void setMap(HashMap<Cell, Entity> map) {
        this.map = map;
    }
}
