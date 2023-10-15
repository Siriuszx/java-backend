package homework_26;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) (3.14 * Math.pow(radius, 2));
    }

    public float getRadius() {
        return radius;
    }
}
