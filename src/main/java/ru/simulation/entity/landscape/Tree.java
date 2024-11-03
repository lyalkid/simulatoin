package ru.simulation.entity.landscape;

import ru.simulation.Cell;
import ru.simulation.entity.Entity;

public class Tree extends Entity {

    public Tree(Cell cell) {
        super(cell);
    }

    @Override
    public void draw(){
        System.out.print("\uD83C\uDF33");

    }
}
