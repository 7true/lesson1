package com.geekbrains.lesson1;

public class Dog extends Animal {
    private static final int runRestriction = 500;
    private static final int swimRestriction = 10;

    public Dog(String name) {
        super(name, swimRestriction, runRestriction);
    }
}
