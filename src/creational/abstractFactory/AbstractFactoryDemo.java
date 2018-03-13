package creational.abstractFactory;

/**
 * Abstract Factory Pattern, creational
 * Works around a super factory which creates other factories
 * AbstractFactory is the super factory which creates factories like shape factory and color factory
 */

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        // Abstract Factory has abstract method to create color and shape
        // Shape Factory is used to create shapes
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        IShape shapeOne = shapeFactory.getShape("CIRCLE");
        shapeOne.draw();

        IShape shapeTwo = shapeFactory.getShape("RECTANGLE");
        shapeTwo.draw();

        IShape shapeThree = shapeFactory.getShape("SQUARE");
        shapeThree.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        IColor colorOne = colorFactory.getColor("RED");
        colorOne.fill();

        IColor colorTwo = colorFactory.getColor("GREEN");
        colorTwo.fill();

        IColor colorThree = colorFactory.getColor("BLUE");
        colorThree.fill();
    }

}
