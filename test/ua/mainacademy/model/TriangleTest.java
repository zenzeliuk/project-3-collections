package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle(1, 5);
        double d = (1.0 * 5.0) / 2;
        assertEquals(d, triangle.getArea());
    }
}