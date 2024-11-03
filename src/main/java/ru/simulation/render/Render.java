package ru.simulation.render;

import ru.simulation.entity.Entity;
import ru.simulation.map.Cell;
import ru.simulation.map.Map;

public class Render implements Renderable {

    @Override
    public void renderMap(Map map, int fieldY, int fieldX) {
        for (int i = 0; i < fieldY; i++) {
            for (int j = 0; j < fieldX; j++) {
                Cell key = new Cell(i, j);
                Entity entity = map.getEntity(key);
                entity.draw();
            }
            System.out.println();
        }
    }
}
