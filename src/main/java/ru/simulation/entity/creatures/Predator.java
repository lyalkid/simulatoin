package ru.simulation.entity.creatures;

import ru.simulation.Cell;

public class Predator extends Creature {

    private Herbivore resource;
    public Predator(int speed, int hp, double radius, Cell cell){
        super(speed, hp, radius, cell);
    }

    @Override
    public void makeMove() {

    }
}
