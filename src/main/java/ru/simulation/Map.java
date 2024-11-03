package ru.simulation;

import ru.simulation.entity.Entity;

import java.util.HashMap;

public class Map {
    private HashMap<Cell, Entity> map;

    public Map(){
        this.map = new HashMap<>();
    }

    public boolean containsCell(Cell cell) {
        return this.map.containsKey(cell);
    }
    public void put(Cell key, Entity value){
        map.put(key, value);
    }
    public Entity getEntity(Cell cell){
        return map.get(cell);
    }
}
