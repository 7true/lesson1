package com.geekbrains.lesson1;

public class Cat extends Animal {
    static int runRestriction = 500;
    static int swimRestriction = 10;

    public Cat(String name) {
        super(name, swimRestriction, runRestriction);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + this.name + " не умеет плавать");
    }
}
