package ru.simulation.render;

import ru.simulation.map.Map;

public interface Renderable
{
//    void renderMap();

    void renderMap(Map map, int fieldY, int fieldX);
}
