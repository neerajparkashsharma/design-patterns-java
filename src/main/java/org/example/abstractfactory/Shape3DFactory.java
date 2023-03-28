package org.example.abstractfactory;

public class Shape3DFactory implements AbstractFactory {



    @Override
    public Shape getShape(String shapeType){
        switch (shapeType) {
            case "SPHERE":
                return new Sphere();
            case "CUBE":
                return new Cube();
            default:
                return null;
        }
    }

}
