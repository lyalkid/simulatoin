package ru.simulation.entity.creatures;

import ru.simulation.map.Cell;

public class Predator extends Creature {
    private final int PREDATOR_HP = 100;
    private final int PREDATOR_SPEED = 1;
    private final int PREDATOR_DAMAGE = 20;
    private final double PREDATOR_RADIUS = 5;
    private final String predator = "\uD83D\uDC01" ;


    private Herbivore resource;


    public Predator( Cell cell){
        super( cell, "");
        setEmoji(predator);
    }

    @Override
    public void draw(){
        System.out.print(getEmoji());
    }

    @Override
    public void makeMove() {

    }

    public int getPREDATOR_HP() {
        return PREDATOR_HP;
    }

    public int getPREDATOR_SPEED() {
        return PREDATOR_SPEED;
    }

    public int getPREDATOR_DAMAGE() {
        return PREDATOR_DAMAGE;
    }

    public double getPREDATOR_RADIUS() {
        return PREDATOR_RADIUS;
    }

    public String getPredator() {
        return predator;
    }
}
