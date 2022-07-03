package com.geekbrains.lesson1;

public class Tiger extends Animal {
    static int runRestriction = 2000;
    static int swimRestriction = 100;

    public Tiger(String name) {
        super(name, swimRestriction, runRestriction);
    }

}
