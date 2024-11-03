package ru.simulation.entity;

import ru.simulation.Cell;

public abstract class Entity {
    private Cell cell;

    public abstract void draw();
    public Entity(Cell cell) {
        this.cell = cell;
    }
    public Entity(int y, int x){
        this.cell = new Cell(y, x);
    }
}
