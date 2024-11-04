package ru.simulation.map;

import ru.simulation.entity.Entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyMap {
    private HashMap<Cell, Entity> map;

    public MyMap() {
        this.map = new HashMap<>();
    }

    public boolean containsCell(Cell cell) {
        return this.map.containsKey(cell);
    }

    public void put(Cell key, Entity value) {
        map.put(key, value);
    }

    public Entity getEntity(Cell cell) {
        return map.get(cell);
    }

    public <T extends Entity> Set<T> getEntitiesOfType(Class<T> clazz) {
        Set<T> creatures = new HashSet<>();
        for (Entity entity : map.values()) {
            if (clazz.isInstance(entity)) {
                creatures.add((T) entity);
            }
        }
        return creatures;
    }

}
