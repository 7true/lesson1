package com.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        int catCount = 0;
        int dogCount = 0;
        int tigerCount = 0;
        int animalCount = 0;

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("sima");
        animals[1] = new Dog("tarz");
        animals[2] = new Cat("frosya");
        animals[3] = new Tiger("Tig");


        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(7);

            switch (animal.getClass().getSimpleName()) {
                case "Cat":
                    catCount++;
                    break;
                case "Dog":
                    dogCount++;
                    break;
                case "Tiger":
                    tigerCount++;
                    break;
                default:
                    break;
            }
            animalCount++;
        }

        System.out.println("\nTotal animals: " + animalCount);
        System.out.println("Cat count: " + catCount);
        System.out.println("Dog count: " + dogCount);
        System.out.println("Tiger count: " + tigerCount);

    }
}
