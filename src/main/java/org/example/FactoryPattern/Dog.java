package org.example.FactoryPattern;

public class Dog implements  Animal{

    @Override
    public void speak() {
        System.out.println("Dog ==> Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog ==> Eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog ==> Sleeping on the floor");
    }
}
