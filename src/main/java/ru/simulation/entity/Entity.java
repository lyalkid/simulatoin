package ru.simulation.entity;

import ru.simulation.Cell;

public abstract class Entity {
    private Cell cell;

    public Entity(Cell cell) {
        this.cell = cell;
    }
}
