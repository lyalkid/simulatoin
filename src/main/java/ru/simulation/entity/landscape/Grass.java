package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Grass extends Entity {

    private final  String grass = "\uD83C\uDF40" ;
    private final int heal = 20;
    public Grass(Cell cell) {
        super(cell, "");
        setEmoji(grass);
    }



    public String getGrass() {
        return grass;
    }

    public int getHeal() {
        return heal;
    }
}
