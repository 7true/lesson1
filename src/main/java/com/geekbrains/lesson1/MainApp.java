package com.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("sima");
        animals[1] = new Dog("tarz");
        animals[2] = new Cat("frosya");
        animals[3] = new Tiger("Tig");


        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(7);

        }

        System.out.println("\nTotal animals: " + Animal.getAnimalCount());
        System.out.println("Cat count: " + Cat.getCatCount());
        System.out.println("Dog count: " + Dog.getDogCount());
        System.out.println("Tiger count: " + Tiger.getTigerCount());

    }
}
