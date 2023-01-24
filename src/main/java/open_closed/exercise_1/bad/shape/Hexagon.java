package open_closed.exercise_1.bad.shape;

import static java.lang.Math.sqrt;

public class Hexagon extends Shape {

    private final double radius;

    public Hexagon(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return ((3 * sqrt(3))/2) * radius;
    }
}
