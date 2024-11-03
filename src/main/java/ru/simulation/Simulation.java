package ru.simulation;

import ru.simulation.entity.Entity;
import ru.simulation.entity.creatures.Herbivore;
import ru.simulation.entity.creatures.Predator;
import ru.simulation.entity.landscape.Empty;
import ru.simulation.entity.landscape.Grass;
import ru.simulation.entity.landscape.Rock;
import ru.simulation.entity.landscape.Tree;
import ru.simulation.map.Cell;
import ru.simulation.map.Map;

import java.util.Random;

public class Simulation {
    private final int FIELD_X = 20;
    private final int FIELD_Y = 10;

    private Map map;

    public Simulation() {
        this.map = new Map();
    }

    public void nextTurn() {
    }

    public void startSimulation() {
        initMap();
        renderMap();
    }

    public void pauseSimulation() {
    }

    public void initMap() {
        Random random = new Random();

        for (int i = 0; i < FIELD_Y; i++) {
            for (int j = 0; j < FIELD_X; j++) {
                Cell cell = new Cell(i, j);
                int randomNum = random.nextInt(100);
                if (randomNum < 50) {
                    map.put(cell, new Empty(cell));       // 50% для пустых клеток
                } else if (randomNum < 65) {
                    map.put(cell, new Grass(cell));     // 15% для травы
                } else if (randomNum < 75) {
                    map.put(cell, new Herbivore(cell)); // 10% для травоядных
                } else if (randomNum < 85) {
                    map.put(cell, new Predator(cell));  // 10% для хищников
                } else if (randomNum < 92) {
                    map.put(cell, new Tree(cell));      // 7% для деревьев
                } else {
                    map.put(cell, new Rock(cell));      // 8% для камней
                }

            }
        }
    }


    public void renderMap() {
        for (int i = 0; i < FIELD_Y; i++) {
            for (int j = 0; j < FIELD_X; j++) {
                Cell key = new Cell(i, j);
                Entity entity =  map.getEntity(key);
                entity.draw();

            }
            System.out.println();
        }
    }

}
