package org.example.FactoryPattern;

public class Main {
    public static void main(String[] args) {

        /// Factory Pattern
        AnimalFactory animalFactory = new AnimalFactory(); // Animal Factory to create animals


        /// Dog
        Animal animal = animalFactory.getAnimal("Dog");
        animal.speak();
        animal.eat();
        animal.sleep();

        /// Cat

        animal = animalFactory.getAnimal("Cat");
        animal.speak();
        animal.eat();
        animal.sleep();



    }
}
