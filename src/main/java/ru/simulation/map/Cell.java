package ru.simulation.map;

import java.util.Objects;

public class Cell{
    private final int y;
    private final int x;

    public Cell(int y, int x){
        this.y = y;
        this.x = x;
    }

    // Переопределяем hashCode и equals
    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cell cell = (Cell) obj;
        return y == cell.y && x == cell.x;
    }
}
