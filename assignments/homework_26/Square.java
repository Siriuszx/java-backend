package homework_26;

public class Square extends Figure {
    private float sideLength;

    public Square(float sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    public float calculateArea() {
        return (float) sideLength * sideLength;
    }

    public float getSideLength() {
        return sideLength;
    }
}
