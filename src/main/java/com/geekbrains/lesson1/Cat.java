package com.geekbrains.lesson1;

public class Cat extends Animal {
    private static final String type = "Кот";
    private static final int runRestriction = 200;
    private static final int swimRestriction = 0;
    private static int count = 0;
    public static int getCount() {
        return count;
    }


    public Cat(String name) {
        super(type, name, swimRestriction, runRestriction);
        count++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(type + " " + this.name + " не умеет плавать");
    }
}
