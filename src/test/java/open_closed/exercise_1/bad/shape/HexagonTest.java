package open_closed.exercise_1.bad.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexagonTest {

    @Test
    void shouldCalculateArea() {
        Shape hexagon = new Hexagon(2);

        double area = hexagon.calculateArea();

        assertEquals(5.196152422706632, area);
    }
}