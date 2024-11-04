package ru.simulation.entity.creatures;

import ru.simulation.map.Cell;

public class Predator extends Creature {
    private final int PREDATOR_HP = 100;
    private final int PREDATOR_SPEED = 1;
    private final int PREDATOR_DAMAGE = 20;
    private final int PREDATOR_RADIUS = 5;
    private final String predator = "\uD83D\uDC08";


    public Predator(Cell cell) {
        super(cell, "");
        setHp(PREDATOR_HP);
        setSpeed(PREDATOR_SPEED);
        setDamage(PREDATOR_DAMAGE);
        setRadius(PREDATOR_RADIUS);
        setEmoji(predator);
    }


    @Override
    public void makeMove() {

    }

    public String getPredator() {
        return predator;
    }
}
