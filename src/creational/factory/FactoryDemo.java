package creational.factory;

public class FactoryDemo {


    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        IShape shapeOne = factory.getShape("RECTANGLE");
        IShape shapeTwo = factory.getShape("SQUARE");
        IShape shapeThree = factory.getShape("CIRCLE");

        shapeOne.draw();
        shapeTwo.draw();
        shapeThree.draw();

    }
}
