package com.geekbrains.lesson1;

public class Dog extends Animal {
    private static final String type = "Пёс";
    private static final int runRestriction = 500;
    private static final int swimRestriction = 10;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        super(type, name, swimRestriction, runRestriction);
        count++;
    }
}
