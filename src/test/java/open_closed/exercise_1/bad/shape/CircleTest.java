package open_closed.exercise_1.bad.shape;

import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    @Test
    void shouldCalculateCircleArea() {
        Shape circle = new Circle(2);

        double area = circle.calculateArea();

        assertEquals(PI * 4, area);
    }
}