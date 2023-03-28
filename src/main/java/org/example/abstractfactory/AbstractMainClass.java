package org.example.abstractfactory;

public class AbstractMainClass {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("2DShape");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("TRIANGLE");
        shape2.draw();
        shapeFactory = FactoryProducer.getFactory("3DShape");
        Shape shape3 = shapeFactory.getShape("SPHERE");
        shape3.draw();
    }

}
