package com.geekbrains.lesson1;

public class Dog extends Animal {
    static int runRestriction = 500;
    static int swimRestriction = 10;

    public Dog(String name) {
        super(name, swimRestriction, runRestriction);
    }

}
