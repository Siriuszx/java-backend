package homework_26;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return (float) width * height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
