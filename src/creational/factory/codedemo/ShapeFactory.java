package creational.factory.codedemo;

public class ShapeFactory {

    // Gets the class implementation of the shape interface based on the type passed in the method
    public IShape getShape(String shapeType) {

        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}