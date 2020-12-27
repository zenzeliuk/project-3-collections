package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle(10);
        assertEquals(Math.PI * 10 * 10, circle.getArea());
    }
}