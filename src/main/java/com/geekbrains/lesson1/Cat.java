package com.geekbrains.lesson1;

public class Cat extends Animal {
    private static final int runRestriction = 200;
    private static final int swimRestriction = 0;
    private static int catCount = 0;
    public static int getCatCount() {
        return catCount;
    }


    public Cat(String name) {
        super(name, swimRestriction, runRestriction);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + this.name + " не умеет плавать");
    }
}
