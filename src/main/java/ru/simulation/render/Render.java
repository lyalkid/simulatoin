package ru.simulation.render;

import ru.simulation.entity.Entity;
import ru.simulation.map.Cell;
import ru.simulation.map.MyMap;

public class Render implements Renderable {

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void renderMap(MyMap myMap, int fieldY, int fieldX) {
        clearScreen();
        for (int i = 0; i < fieldY; i++) {
            for (int j = 0; j < fieldX; j++) {
                Cell key = new Cell(i, j);
                Entity entity = myMap.getEntity(key);
                entity.draw();
            }
            System.out.println();
        }
    }
}
