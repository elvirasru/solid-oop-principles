package open_closed.exercise_1.bad.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Shape rectangle = new Rectangle(2, 3);

        double area = rectangle.calculateArea();

        assertEquals(6, area);
    }
}