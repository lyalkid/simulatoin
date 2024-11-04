package ru.simulation;


public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        
        try {
            simulation.startSimulation();
        } catch (InterruptedException ex) {
            System.out.println("Something wrong");
        }
    }
}