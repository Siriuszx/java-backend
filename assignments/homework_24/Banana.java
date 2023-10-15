package homework_24;

public class Banana extends Fruit{
    public Banana(String fruitName, int fruitCount) {
        super(fruitName, fruitCount);
    }

    public void peel() {
        System.out.println("*peels banana*");
    }
}
