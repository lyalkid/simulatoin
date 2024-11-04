package ru.simulation;

import ru.simulation.action.Init;
import ru.simulation.action.Turn;

import ru.simulation.entity.creatures.Creature;
import ru.simulation.entity.creatures.Herbivore;
import ru.simulation.entity.creatures.Predator;

import ru.simulation.entity.landscape.Grass;

import ru.simulation.map.Cell;
import ru.simulation.map.MyMap;
import ru.simulation.path_finder.PathFinder;
import ru.simulation.render.Render;

public class Simulation {
    private final Init initAction;
    private final Turn turnAction;
    private final Render render;
    private final PathFinder pathFinder;
    private final int FIELD_X = 20;
    private final int FIELD_Y = 10;
    private int moveCounter;
    private int predatorCounter;
    private int herbivoreCounter;
    private int grassCounter;
    private MyMap myMap;
    private boolean gameIsRunning = true;

    public Simulation() {
        this.initAction = new Init();
        this.turnAction = new Turn();
        this.render = new Render();
        this.pathFinder = new PathFinder(FIELD_Y, FIELD_X);
        this.myMap = new MyMap();

        this.moveCounter = 0;
        this.predatorCounter = 0;
        this.herbivoreCounter = 0;
        this.grassCounter = 0;
    }


    public void nextTurn() {
        turnAction.detectTargets(myMap, pathFinder);
        calcCurrentEntitys();
        render.renderMap(myMap, FIELD_Y, FIELD_X);
        printInfo();
    }

    public void startSimulation() throws InterruptedException {
        initAction.initMap(myMap, FIELD_Y, FIELD_X);
        calcCurrentEntitys();
        while (gameIsRunning) {
            nextTurn();
            Thread.sleep(1000);
            break;
//            turnAction.movement(myMap);
        }
    }

    private void printInfo() {
        System.out.printf("moves: %d, predators: %d, herbivore: %d, grass: %d \n", moveCounter++, predatorCounter, herbivoreCounter, grassCounter);
    }

    public void pauseSimulation() {
    }

    private void calcCurrentEntitys() {
        predatorCounter = myMap.getEntitiesOfType(Predator.class).size();
        herbivoreCounter = myMap.getEntitiesOfType(Herbivore.class).size();
        grassCounter = myMap.getEntitiesOfType(Grass.class).size();
    }


}
