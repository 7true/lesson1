package com.geekbrains.lesson1;

public class Dog extends Animal {
    private static final int runRestriction = 500;
    private static final int swimRestriction = 10;

    private static int dogCount = 0;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name) {
        super(name, swimRestriction, runRestriction);
        dogCount++;
    }
}
