package open_closed.exercise_1.bad.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateArea() {
        Shape triangle = new Triangle(2, 2, 2);

        double area = triangle.calculateArea();

        assertEquals(1.7320508075688772, area);
    }
}