package ru.simulation.action;

import ru.simulation.entity.creatures.Creature;
import ru.simulation.entity.creatures.Herbivore;
import ru.simulation.entity.creatures.Predator;
import ru.simulation.map.Cell;
import ru.simulation.map.MyMap;
import ru.simulation.path_finder.PathFinder;

public class Turn extends Action {

    public void movement(MyMap myMap) {
        for (Creature creature : myMap.getEntitiesOfType(Creature.class)) {
            creature.makeMove();

        }
    }

    public void detectTargets(MyMap myMap, PathFinder pathFinder){
        for (Creature creature : myMap.getEntitiesOfType(Creature.class)) {
            Cell nearest = pathFinder.findNearest(myMap, creature.getCell(), creature.getResource(), creature.getRadius());
            if (nearest.getX() != -1 && nearest.getY() != -1) {
                System.out.printf("src: %s\ntarget: %s\n", creature.toString(), myMap.getEntity(nearest));
            }
            creature.setTarget(myMap.getEntity(nearest));
        }
    }
}
