package ru.simulation.entity.creatures;

import ru.simulation.entity.landscape.Grass;
import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;
    private int damage;
    private int radius;
    private Class<? extends Entity> resource;
    private Entity target;

    public Entity getTarget() {
        return target;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public abstract void makeMove();

    public Creature(Cell cell, String emoji) {
        super(cell, emoji);
        if (this instanceof Predator) this.resource = Herbivore.class;
        if (this instanceof Herbivore) this.resource = Grass.class;
    }

    public Class<? extends Entity> getResource() {
        return resource;
    }

    public void setResource(Class<? extends Entity> resource) {
        this.resource = resource;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
