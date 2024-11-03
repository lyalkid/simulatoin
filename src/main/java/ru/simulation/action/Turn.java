package ru.simulation.action;

import ru.simulation.entity.Entity;
import ru.simulation.entity.creatures.Creature;
import ru.simulation.map.Map;

public class Turn extends Action {

    public void movement(Map map) {
        for (Creature creature : map.getEntitiesOfType(Creature.class)) {
            creature.makeMove();
        }
    }
}
