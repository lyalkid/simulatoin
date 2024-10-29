package ru.simulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map my_map  = new Map();
        Class <? extends Map> clazz = my_map.getClass();
           System.out.println(clazz.toString());
        my_map.load();
    }
}