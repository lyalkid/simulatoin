package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Empty extends Entity {
    private final String empty = "\uD83D\uDFEB" ;


    public Empty(Cell cell) {
        super(cell, "");
        setEmoji(empty);

    }

    @Override
    public void draw() {
        System.out.print(getEmoji());
    }

    public String getEmpty() {
        return empty;
    }
}
