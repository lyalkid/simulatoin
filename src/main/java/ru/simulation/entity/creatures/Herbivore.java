package ru.simulation.entity.creatures;

import ru.simulation.map.Cell;
import ru.simulation.entity.landscape.Grass;

public class Herbivore extends Creature{
    private final int HERBIVORE_HP = 60;
    private final int HERBIVORE_SPEED = 3;
    private final int HERBIVORE_DAMAGE = 2;
    private final int HERBIVORE_RADIUS = 4;
    private final String herbivore = "\uD83D\uDC01";

    public Herbivore( Cell cell){
        super(cell, "");
        setHp(HERBIVORE_HP) ;
        setSpeed(HERBIVORE_SPEED);
        setDamage(HERBIVORE_DAMAGE);
        setRadius(HERBIVORE_RADIUS);
        setEmoji(herbivore);
    }


    public String getHerbivore() {
        return herbivore;
    }

    @Override
    public void makeMove() {

    }
}
