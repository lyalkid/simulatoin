package ru.simulation;

import ru.simulation.action.Init;
import ru.simulation.action.Turn;
import ru.simulation.entity.Entity;
import ru.simulation.entity.creatures.Herbivore;
import ru.simulation.entity.creatures.Predator;
import ru.simulation.entity.landscape.Empty;
import ru.simulation.entity.landscape.Grass;
import ru.simulation.entity.landscape.Rock;
import ru.simulation.entity.landscape.Tree;
import ru.simulation.map.Cell;
import ru.simulation.map.Map;
import ru.simulation.render.Render;

import java.util.Random;

public class Simulation {
    private final Init initAction;
    private final Turn turnAction;
    private final Render render;
    private final int FIELD_X = 20;
    private final int FIELD_Y = 10;
    private int moveCounter;
    private int predatorCounter;
    private int herbivoreCounter;
    private int grassCounter;
    private Map map;
    private boolean gameIsRunning = true;

    public Simulation() {
        this.initAction = new Init();
        this.turnAction = new Turn();
        this.render = new Render();
        this.map = new Map();
        this.moveCounter = 0;
        this.predatorCounter = 0;
        this.herbivoreCounter = 0;
        this.grassCounter = 0;
    }


    public void nextTurn() {
    }

    public void startSimulation() throws InterruptedException {
        initAction.initMap(map, FIELD_Y, FIELD_X);
        while (gameIsRunning) {
            calcCurrentEntitys();
            printInfo();
            render.renderMap(map, FIELD_Y, FIELD_X);
            Thread.sleep(1000);
            turnAction.movement(map);
        }
    }

    private void printInfo() {
        System.out.printf("moves: %d, predators: %d, herbivore: %d, grass: %d \n", moveCounter++, predatorCounter, herbivoreCounter, grassCounter);
    }

    public void pauseSimulation() {
    }

    private void calcCurrentEntitys() {
        predatorCounter = map.getEntitiesOfType(Predator.class).size();
        herbivoreCounter = map.getEntitiesOfType(Herbivore.class).size();
        grassCounter = map.getEntitiesOfType(Grass.class).size();
    }


}
