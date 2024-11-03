package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Rock extends Entity {

    public Rock(Cell cell) {
        super(cell);
    }

    @Override
    public void draw(){
        System.out.print("⚫");
    }
}
