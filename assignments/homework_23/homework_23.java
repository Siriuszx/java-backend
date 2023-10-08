package homework_23;

public class homework_23 {
    public static void main(String[] args) {
        int[] rndArr = new int[]{21, 1, 2, 4, 0, 15, 200, 123, -4, 22, -12};
        int[] rndArr2 = new int[]{2, 8, 5, 3, 9, 4, 1, 7};

        ArraySort.bubbleSort(rndArr);
        ArraySort.printArr(rndArr);

        System.out.println("\n----");

        ArraySort.mergeSort(rndArr2);
        ArraySort.printArr(rndArr2);
    }
}
