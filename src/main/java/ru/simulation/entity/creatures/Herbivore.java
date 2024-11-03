package ru.simulation.entity.creatures;

import ru.simulation.map.Cell;
import ru.simulation.entity.landscape.Grass;

public class Herbivore extends Creature{
    private final int HERBIVORE_HP = 60;
    private final int HERBIVORE_SPEED = 3;
    private final int HERBIVORE_DAMAGE = 2;
    private final double HERBIVORE_RADIUS = 4;
    private Grass resource;
    private final String herbivore = "\uD83D\uDC08";

    public Herbivore( Cell cell){
        super(cell, "");
        setEmoji(herbivore);
    }


    @Override
    public void draw(){
        System.out.print(getEmoji());
    }

    public int getHERBIVORE_HP() {
        return HERBIVORE_HP;
    }

    public int getHERBIVORE_SPEED() {
        return HERBIVORE_SPEED;
    }

    public int getHERBIVORE_DAMAGE() {
        return HERBIVORE_DAMAGE;
    }

    public double getHERBIVORE_RADIUS() {
        return HERBIVORE_RADIUS;
    }

    public String getHerbivore() {
        return herbivore;
    }

    @Override
    public void makeMove() {

    }
}
