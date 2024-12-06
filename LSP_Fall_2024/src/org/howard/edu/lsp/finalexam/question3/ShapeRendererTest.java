package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// I used ChatGPT to help create my tests

public class ShapeRendererTest {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("circle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Circle, "Shape should be a Circle");
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("rectangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Rectangle, "Shape should be a Rectangle");
    }

    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("triangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Triangle, "Shape should be a Triangle");
    }

    @Test
    public void testUnknownShapeCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("hexagon");
        assertNull(shape, "Shape should be null for unknown types");
    }
}
