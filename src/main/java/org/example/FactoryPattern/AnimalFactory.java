package org.example.FactoryPattern;

public class AnimalFactory {

    /*
    *
    * Factory Pattern
    *
    *   - Factory pattern is one of the creational design pattern, and it's used to create objects without exposing the instantiation logic to the client and refer to newly created object using a common interface.
    *   -
    *   - Factory pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
    *
    * */



    // Factory method to get animals

    
    public Animal getAnimal(String animalType) {
        // enhanced switch statement (Java 12) to return the animal object based on the animal type (Dog, Cat, Cow, Goat ) Child class
        // return type is Animal interface, so it can return any of the child class object
        return switch (animalType) {
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            case "Cow" -> new Cow();
            case "Goat" -> new Goat();
            default -> null;
        };
    }
}

