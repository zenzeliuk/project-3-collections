package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Shape;
import ua.mainacademy.model.Square;
import ua.mainacademy.model.Triangle;

import java.util.*;
import java.util.logging.Logger;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        Circle circle_1 = new Circle(25);
        Circle circle_2 = new Circle(10);
        Square square_1 = new Square(10);
        Square square_2 = new Square(20);
        Triangle triangle_1 = new Triangle(10, 28);
        Triangle triangle_2 = new Triangle(15, 10);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle_1);
        shapeList.add(circle_2);
        shapeList.add(square_1);
        shapeList.add(square_2);
        shapeList.add(triangle_1);
        shapeList.add(triangle_2);
        shapeList.add(square_1);
        shapeList.add(square_1);

        Shape minShape = null;
        Shape maxShape = null;

        double minArea = Double.MAX_VALUE;
        double maxArea = Double.MIN_VALUE;

        for (Shape shape : shapeList) {
            if (minArea > shape.getArea()) {
                minArea = shape.getArea();
                minShape = shape;
            }
            if (maxArea < shape.getArea()) {
                maxArea = shape.getArea();
                maxShape = shape;
            }
        }

        LOGGER.info("Min shape " + minShape.getClass().getSimpleName() + " has area is : " + minShape.getArea());
        LOGGER.info("Max shape " + maxShape.getClass().getSimpleName() + " has area is : " + maxShape.getArea());

    }
}
