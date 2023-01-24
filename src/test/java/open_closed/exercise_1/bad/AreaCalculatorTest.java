package open_closed.exercise_1.bad;

import open_closed.exercise_1.bad.shape.Shape;
import open_closed.exercise_1.bad.shape.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void shouldCalculateArea() {
        Shape square = new Square(2);

        double area = AreaCalculator.calculateArea(square);

        assertEquals(4, area);
    }
}