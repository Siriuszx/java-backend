package homework_18;

public class homework_18 {
    public static void main(String[] args) {
        RubberArray arr = new RubberArray();

        arr.push(1);
        arr.push(2);
        arr.push(3);

        arr.printAllItems();

        System.out.println();

        arr.remove(2);
        arr.printAllItems();
        System.out.printf("The length is: '%d'\n", arr.length());
        System.out.printf("The index of an item '2' is: '%d'\n", arr.indexOf(2));

        System.out.println();

        arr.splice(3, 4, 5);
        arr.printAllItems();

        System.out.println();

        arr.removeByValue(3);
        arr.removeByValue(1);
        arr.printAllItems();

        System.out.println();

        arr.replaceByValue(5, 123);
        arr.printAllItems();

        System.out.println();

        Dog sally = new Dog("Sally", 100);
        Dog fluffy = new Dog("Fluffy", 200);

        sally.jumpOverBarrier(190);
        fluffy.train();

        for (int i = 0; i < 11; i++) {
            sally.train();
        }

        sally.jumpOverBarrier(190);
        fluffy.jumpOverBarrier(100);

        System.out.printf("Total jump count made by dogs: %d\n", Dog.getJumpsCount());
    }
}
