package org.example.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        switch (choice) {
            case "2DShape":
                return new Shape2DFactory();
            case "3DShape":
                return new Shape3DFactory();
            default:
                return null;
        }
    }
}
