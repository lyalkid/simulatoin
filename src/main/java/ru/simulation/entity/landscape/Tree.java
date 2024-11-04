package ru.simulation.entity.landscape;

import ru.simulation.map.Cell;
import ru.simulation.entity.Entity;

public class Tree extends Entity {

    private final String tree = "\uD83C\uDF33";


    public Tree(Cell cell ) {
        super(cell, "");
        setEmoji(tree);
    }



    public String getTree() {
        return tree;
    }
}
