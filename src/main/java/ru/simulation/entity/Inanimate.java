package ru.simulation.entity;

public abstract class Inanimate extends Entity{
    private boolean isStatic;

    public  Inanimate(boolean is_static){
        this.isStatic = is_static;
    }

    public void setStatic(boolean r){
        this.isStatic = r;
    }
    public boolean getType(){
        return this.isStatic;
    }
}
