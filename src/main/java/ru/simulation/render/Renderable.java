package ru.simulation.render;

import ru.simulation.map.MyMap;

public interface Renderable
{
//    void renderMap();

    void renderMap(MyMap myMap, int fieldY, int fieldX);
}
