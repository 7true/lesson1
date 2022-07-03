package com.geekbrains.lesson1;
public  abstract class Animal {
    String type;
    String name;
    private int swimRestriction;
    private int runRestriction;
    private static int count = 0;
    public static int getCount() {
        return count;
    }

    public Animal(String type, String name, int swimRestriction, int runRestriction) {
        this.type = type;
        this.name = name;
        this.swimRestriction = swimRestriction;
        this.runRestriction = runRestriction;
        count++;
    }
    public void swim(int distance) {
        if (distance <= swimRestriction && distance >= 0) {
            System.out.println(type + " " + name + " проплыл " + distance + " м");
        } else {
            System.out.println(type + " " + name + " проплыл " + swimRestriction + " м");
        }
    }

    void run(int distance) {
        if (distance <= runRestriction && distance >= 0) {
            System.out.println(type + " " + name + " пробежал " + distance + " м");
        } else {
            System.out.println(type + " " + name + " пробежал " + runRestriction + " м");
        }
    }
}
