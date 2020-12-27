package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square square = new Square(7);
        assertEquals(7.0 * 7.0, square.getArea());
    }
}