package ru.simulation.path_finder;

import ru.simulation.entity.Entity;
import ru.simulation.entity.creatures.Herbivore;
import ru.simulation.entity.landscape.Empty;
import ru.simulation.entity.landscape.Grass;
import ru.simulation.map.Cell;
import ru.simulation.map.MyMap;

import java.util.*;

public class PathFinder {
    private final String path = "⚫";
    private int y;
    private int x;


    public PathFinder(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public Cell findNearest(MyMap myMap, Cell start, Class<? extends Entity> targetType, int maxDistance) {
        maxDistance = 100;
        Cell cell = new Cell(-1, -1);
        Queue<Cell> queue = new LinkedList<>();
        Map<Cell, Integer> distances = new HashMap<>(); // Карта для отслеживания расстояний
//        boolean[][] visited = new boolean[y][x];
        Set<Cell> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            Cell current = queue.poll();
            int currentDistance = -1;
            if (!distances.isEmpty()) currentDistance = distances.get(current);

            // Прекращаем поиск, если достигнут максимальный радиус
            if (currentDistance > maxDistance) {
                break;
            }

            // Проверка, является ли текущая клетка целью
            Entity entity = myMap.getEntity(current);
            if (entity != null && targetType.isInstance(entity)) {
                return current; // Возвращаем клетку с целью
            }

            // Добавляем соседние клетки для дальнейшего поиска
            for (int[] direction : directions) {
                Cell neighbor = new Cell(current.getX() + direction[0], current.getY() + direction[1]);

                // Проверка, что клетка ещё не посещена и доступна
                if (!distances.containsKey(neighbor) && isCellAccessible(myMap.getEntity(neighbor))) {
                    queue.add(neighbor);
                    distances.put(neighbor, currentDistance + 1); // Обновляем расстояние для соседней клетки
                }
            }
        }

        return cell;
    }

    public boolean isCellAccessible(Entity entity) {
        return entity instanceof Empty || entity instanceof Herbivore || entity instanceof Grass;
    }
}


