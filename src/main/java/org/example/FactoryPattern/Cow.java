package org.example.FactoryPattern;

public class Cow implements Animal {

    @Override
    public void speak() {
        System.out.println("Cow ==> Moo");
    }

    @Override
    public void eat() {
        System.out.println("Cow ==> Eating grass");
    }

    @Override
    public void sleep() {
        System.out.println("Cow ==> Sleeping in the barn");
    }

}
