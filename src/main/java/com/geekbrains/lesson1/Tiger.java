package com.geekbrains.lesson1;

public class Tiger extends Animal {
    private static final int runRestriction = 2000;
    private static final int swimRestriction = 100;
    private static int count = 0;
    public static int getCount() {
        return count;
    }

    public Tiger(String name) {
        super(name, swimRestriction, runRestriction);
        count++;
    }

}
