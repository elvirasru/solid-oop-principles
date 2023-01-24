package open_closed.exercise_1.bad.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCreateArea() {
        Shape square = new Square(2);

        double area = square.calculateArea();

        assertEquals(4, area);
    }
}