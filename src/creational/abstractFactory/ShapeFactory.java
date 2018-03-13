package creational.abstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    IColor getColor(String color) {
        return null;
    }

    @Override
    IShape getShape(String shape) {
        if(shape == null) {
            return null;
        }

        if(shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if(shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        if(shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
