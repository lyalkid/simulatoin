package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Empty extends Entity {


    public Empty(Cell cell) {
        super(cell);
    }

    @Override
    public void draw() {
        System.out.print("\uD83D\uDFEB");
    }
}
