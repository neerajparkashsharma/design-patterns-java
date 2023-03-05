package org.example.FactoryPattern;

public class Goat  implements Animal{

    @Override
    public void speak() {
        System.out.println("Goat ==> Baa");
    }

    @Override
    public void eat() {
        System.out.println("Goat ==> Eating grass");
    }

    @Override
    public void sleep() {
        System.out.println("Goat ==> Sleeping on the floor");
    }
}
