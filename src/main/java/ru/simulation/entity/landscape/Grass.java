package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Grass extends Entity {

    private final int heal = 20;
    public Grass(Cell cell) {
        super(cell);
    }

    @Override
    public void draw(){
//        System.out.print("\uD83C\uDF3F");
        System.out.print("\uD83C\uDF40");
    }

}
