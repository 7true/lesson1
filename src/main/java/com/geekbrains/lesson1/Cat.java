package com.geekbrains.lesson1;

public class Cat extends Animal {
    private static final int runRestriction = 200;
    private static final int swimRestriction = 0;

    public Cat(String name) {
        super(name, swimRestriction, runRestriction);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + this.name + " не умеет плавать");
    }
}
