package ru.simulation.entity.creatures;

import ru.simulation.map.Cell;

public class Predator extends Creature {
    private final int PREDATOR_HP = 100;
    private final int PREDATOR_SPEED = 1;
    private final int PREDATOR_DAMAGE = 20;
    private final double PREDATOR_RADIUS = 5;

    private Herbivore resource;


    public Predator( Cell cell){
        super( cell);
    }

    @Override
    public void draw(){
        System.out.print("\uD83D\uDC01");
    }

    @Override
    public void makeMove() {

    }
}
