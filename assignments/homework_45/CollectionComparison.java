package homework_45;

import java.util.*;

public class CollectionComparison {
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();
    private final int CAPACITY;

    CollectionComparison(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        listsInit();
    }

    CollectionComparison() {
        CAPACITY = 1000;
        listsInit();
    }

    private void listsInit() {
        Random random = new Random();

        int tempValue;

        arrayList.clear();
        linkedList.clear();

        for (int i = 0; i < CAPACITY; i++) {
            tempValue = random.nextInt(10000 + 1);
            arrayList.add(tempValue);
            linkedList.add(tempValue);
        }
    }

    public long timeComplexityRetrieval(List<Integer> list) {
        int tempValue;

        long timeStart = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            tempValue = list.get(i);
        }

        long timeEnd = System.nanoTime();

        return timeEnd - timeStart;
    }

    public long timeComplexityInsertion(List<Integer> list) {
        Random random = new Random();
        int tempIndex;
        int tempValue;

        long timeStart = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            tempIndex = random.nextInt(CAPACITY);
            tempValue = random.nextInt(10000 + 1);

            list.add(tempIndex, tempValue);
        }

        long timeEnd = System.nanoTime();
//        System.out.println("\t\t\tTime start: " + timeStart);
//        System.out.println("\t\t\tTime end: " + timeEnd);
        return timeEnd - timeStart;
    }

    public long timeComplexityDeletion(List<Integer> list) {
        Random random = new Random();
        int tempIndex;

        long timeStart = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            tempIndex = random.nextInt(CAPACITY);
            list.remove(tempIndex);
        }

        long timeEnd = System.nanoTime();

        return timeEnd - timeStart;
    }

    public static List<Integer> intersection(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> temp = new ArrayList<>(listOne);

        temp.retainAll(listTwo);

        return temp;
    }

    public List<Integer> getArrayList() {
        return arrayList;
    }

    public List<Integer> getLinkedList() {
        return linkedList;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }
}
