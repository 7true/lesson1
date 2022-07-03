package com.geekbrains.lesson1;

public class Tiger extends Animal {
    private static final int runRestriction = 2000;
    private static final int swimRestriction = 100;
    private static int tigerCount = 0;
    public static int getTigerCount() {
        return tigerCount;
    }

    public Tiger(String name) {
        super(name, swimRestriction, runRestriction);
        tigerCount++;
    }

}
