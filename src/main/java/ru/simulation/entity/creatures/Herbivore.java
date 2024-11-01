package ru.simulation.entity.creatures;

import ru.simulation.Cell;
import ru.simulation.entity.landscape.Grass;

public class Herbivore extends Creature{

    private Grass resource;

    public Herbivore(int speed, int hp, double radius, Cell cell){
        super(speed, hp, radius, cell);
    }


    @Override
    public void makeMove() {
        
    }
}
