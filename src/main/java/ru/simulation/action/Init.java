package ru.simulation.action;

import ru.simulation.entity.creatures.*;
import ru.simulation.entity.landscape.*;
import ru.simulation.map.Cell;
import ru.simulation.map.Map;

import java.util.Random;

public class Init extends Action {
    public void initMap(Map map, int fieldY, int fieldX) {
        int p = 0, g = 0, h = 0;
        boolean flag = false;
        Random random = new Random();
        for (int i = 0; i < fieldY; i++) {
            for (int j = 0; j < fieldX; j++) {
                Cell cell = new Cell(i, j);
                int randomNum = random.nextInt(100);
                if (randomNum < 50) {
                    map.put(cell, new Empty(cell));// 50% для пустых клеток
                    flag = true;
                } else if (randomNum < 65 && g < 1) {
                    map.put(cell, new Grass(cell));// 15% для травы
                    g++;
                    flag = true;
                } else if (randomNum < 75 && h < 1 && i == 6) {
                    map.put(cell, new Herbivore(cell)); // 10% для травоядных
                    h++;
                    flag = true;
                } else if (randomNum < 85 && p < 1 && i== 1) {
                    map.put(cell, new Predator(cell));  // 10% для хищников
                    p++;
                    flag = true;
                }
//                else if (randomNum < 92) {
//                    map.put(cell, new Tree(cell));      // 7% для деревьев
//                    flag = true;
//                } else {
//                    map.put(cell, new Rock(cell));      // 8% для камней
//                    flag = true;
//                }
                if (flag) {
                    flag = false;
                }
                else{
                    map.put(cell, new Empty(cell));
                }
            }
        }
    }
}
