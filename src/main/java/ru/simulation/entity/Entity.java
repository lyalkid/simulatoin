package ru.simulation.entity;

import ru.simulation.map.Cell;

public abstract class Entity {
    private Cell cell;
    private String emoji;


    public void draw() {
        System.out.print(getEmoji());
    }

    public Entity(Cell cell, String emoji) {
        this.cell = cell;
        this.emoji = emoji;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Entity(int y, int x) {
        this.cell = new Cell(y, x);
    }

    public String getEmoji() {
        return this.emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "cell=" + cell +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
