package homework_24;

public class Orange extends Fruit{
    public Orange(String fruitName, int fruitCount) {
        super(fruitName, fruitCount);
    }

    public void cut(){
        System.out.println("*cuts orange*");
    }
}
