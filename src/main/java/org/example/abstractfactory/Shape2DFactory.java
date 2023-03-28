package org.example.abstractfactory;


public class Shape2DFactory  implements AbstractFactory {

    @Override
    public Shape getShape(String shapeType)
    {

        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "TRIANGLE":
                return new Triangle();
            default:
                return null;
        }
    }

}
