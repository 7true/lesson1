package com.geekbrains.lesson1;
public  abstract class Animal {
    String name;
    private final int swimRestriction;
    private final int runRestriction;
    private static int count = 0;
    public static int getCount() {
        return count;
    }

    public Animal(String name, int swimRestriction, int runRestriction) {
        this.name = name;
        this.swimRestriction = swimRestriction;
        this.runRestriction = runRestriction;
        count++;
    }
    public void swim(int distance) {
        if (distance <= swimRestriction && distance >= 0) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " проплыл " + swimRestriction + " м");
        }
    }

    void run(int distance) {
        if (distance <= runRestriction && distance >= 0) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " пробежал " + runRestriction + " м");
        }
    }
}
