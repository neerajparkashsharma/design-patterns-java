package org.example.FactoryPattern;

public class Cat  implements Animal{
// Cat class implements the Animal interface

    //
    @Override
    public void speak() {
        // speak method implementation
        System.out.println("Cat ==> Meow");
    }

    @Override
    public void eat() {
        // eat method implementation
        System.out.println("Cat ==> Eating fish");
    }

    @Override
    public void sleep() {
        // sleep method implementation
        System.out.println("Cat ==> Sleeping on the bed");
    }

}
