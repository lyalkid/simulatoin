package ru.simulation.entity.creatures;

import ru.simulation.Cell;
import ru.simulation.entity.landscape.Grass;

public class Herbivore extends Creature{
    private final int HERBIVORE_HP = 60;
    private final int HERBIVORE_SPEED = 3;
    private final int HERBIVORE_DAMAGE = 2;
    private final double HERBIVORE_RADIUS = 4;
    private Grass resource;


    public Herbivore( Cell cell){
        super(cell);
    }


    @Override
    public void draw(){
        System.out.print("\uD83D\uDC08");
    }

    @Override
    public void makeMove() {

    }
}
