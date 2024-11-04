package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Rock extends Entity {
    private final String rock = "⚫";
    public Rock(Cell cell ) {
        super(cell, "");
        setEmoji(rock);
    }



    public String getRock() {
        return rock;
    }
}
