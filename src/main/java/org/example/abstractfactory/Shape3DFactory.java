package org.example.abstractfactory;

public class Shape3DFactory {
    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CUBE")){
            return new Cube();
        }
        else if(shapeType.equalsIgnoreCase("SPHERE")){
            return new Sphere();
        }

        return null;
    }

}
