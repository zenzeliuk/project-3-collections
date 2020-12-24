package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Shape;
import ua.mainacademy.model.Square;
import ua.mainacademy.model.Triangle;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Circle circle_1 = new Circle(25);
        Circle circle_2 = new Circle(15);
        Square square_1 = new Square(10);
        Square square_2 = new Square(20);
        Triangle triangle_1 = new Triangle(10, 28);
        Triangle triangle_2 = new Triangle(15, 10);


        // List
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle_1);
        shapeList.add(circle_2);
        shapeList.add(square_1);
        shapeList.add(square_2);
        shapeList.add(triangle_1);
        shapeList.add(triangle_2);
        shapeList.add(square_1);
        shapeList.add(square_1);

//        System.out.println("ArrayList size is " + shapeList.size());

//        // HashSet
//        Set<Shape> shapeSet = new HashSet<>();
//        shapeSet.add(circle_1);
//        shapeSet.add(circle_2);
//        shapeSet.add(square_1);
//        shapeSet.add(square_2);
//        shapeSet.add(triangle_1);
//        shapeSet.add(triangle_2);
//        shapeSet.add(square_1);
//        shapeSet.add(square_1);
//        System.out.println("HashSet size is " + shapeSet.size());
//
//        // TreeSet
//        Set<Shape> sortedShapeSet = new TreeSet<>();
//        sortedShapeSet.add(circle_1);
//        sortedShapeSet.add(circle_2);
//        sortedShapeSet.add(square_1);
//        sortedShapeSet.add(square_2);
//        sortedShapeSet.add(triangle_1);
//        sortedShapeSet.add(triangle_2);
//        sortedShapeSet.add(square_1);
//        sortedShapeSet.add(square_1);
//        System.out.println("TreeSet size is " + sortedShapeSet.size());
//
//        // Queue
//        Queue<Shape> shapeQueue = new PriorityQueue<>();
//        shapeQueue.add(circle_1);
//        shapeQueue.add(circle_2);
//        shapeQueue.add(square_1);
//        shapeQueue.add(square_2);
//        shapeQueue.add(triangle_1);
//        shapeQueue.add(triangle_2);
//        shapeQueue.add(square_1);
//        shapeQueue.add(square_1);
//        System.out.println("PriorityQueue size is " + shapeQueue.size());


        double minArea = shapeList.get(0).getArea();
        double maxArea = shapeList.get(0).getArea();
        int indexMinArea = 0;
        int indexMaxArea = 0;


        for (int i = 0; i < shapeList.size(); i++) {
            if (minArea > shapeList.get(i).getArea()) {
                indexMinArea = i;
                minArea = shapeList.get(i).getArea();
            }
            if (maxArea < shapeList.get(i).getArea()) {
                indexMaxArea = i;
                maxArea = shapeList.get(i).getArea();
            }
        }

        System.out.println("Max area is : " + shapeList.get(indexMaxArea).getArea());
        System.out.println("Min area is : " + shapeList.get(indexMinArea).getArea());


//        System.out.println("Test peek");
//        for (int i = 0; i < 3; i++) {
//            System.out.print("PriorityQueue size is " + shapeQueue.size());
//            System.out.println(" area is " + shapeQueue.peek().getArea());
//        }
//
//        System.out.println();
//
//        System.out.println("Test poll");
//        for (int i = 0; i < 8; i++) {
//            System.out.print("PriorityQueue size is " + shapeQueue.size());
//            System.out.println(" area is " + shapeQueue.poll().getArea());
//        }
    }
}
