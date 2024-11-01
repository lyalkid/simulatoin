package ru.simulation.entity.creatures;

import ru.simulation.Cell;
import ru.simulation.entity.Entity;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;
    private double radius;


    public abstract void makeMove();

    public Creature(int speed, int hp, double radius, Cell cell){
        super(cell);
        this.speed = speed;
        this.hp = hp;
        this.radius = radius;

    }
}
