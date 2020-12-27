package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle_test = new Circle();// Class Circle not static, a can create new circle_test
        circle_test.setRadius(5);
        assertEquals(5, circle_test.getRadius());
    }

    @Test
    void setRadius() {
    } // void methods not test

    @Test
    void getArea() {
        Circle circle_test = new Circle(10);
        assertEquals(Math.PI * 100, circle_test.getArea());
    }
}