package creational.factory;

/**
 * Factory Design pattern, Creational
 * ShapeFactory produces shape objects
 */

public class FactoryDemo {


    public static void main(String[] args) {
        // Instantiate the factory
        ShapeFactory factory = new ShapeFactory();

        // Get shape implementations using factory
        IShape shapeOne = factory.getShape("RECTANGLE");
        IShape shapeTwo = factory.getShape("SQUARE");
        IShape shapeThree = factory.getShape("CIRCLE");

        // Call respective methods
        shapeOne.draw();
        shapeTwo.draw();
        shapeThree.draw();

    }
}
