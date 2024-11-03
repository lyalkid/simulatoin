package ru.simulation.entity.creatures;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public abstract class Creature extends Entity {
    private  int speed;
    private  int hp;
    private  int damage;
    private  double radius;


    public abstract void makeMove();

    public Creature( Cell cell){
        super(cell);
    }
}
