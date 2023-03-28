package org.example.abstractfactory;

public class Sphere implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Sphere::draw() method.");
    }
}
