package homework_24;

public class Fruit {
    private String fruitName;
    private int fruitCount;

    public Fruit(String fruitName, int fruitCount) {
        this.fruitName = fruitName;
        this.fruitCount = fruitCount;
    }

    public String info() {
        return String.format("This is %s, in a quantity of %d", fruitName, fruitCount);
    }
}
