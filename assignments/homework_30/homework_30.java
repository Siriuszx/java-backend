package homework_30;

public class homework_30 {
    public static void main(String[] args) {
        GenericRubberArray<Integer> arr = new GenericRubberArray<Integer>();

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
    }
}