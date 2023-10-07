package homework_22;

public class homework_22 {
    public static void main(String[] args) {
        int[] rndArr = new int[]{21, 1, 2, 4, 0, 15, 200, 123, -4, 22, -12};

        ArrayUtil.printArray(ArrayUtil.sortArray(rndArr));

        System.out.println("---------------------");

        System.out.println(ArrayUtil.binarySearch(rndArr, 200));
    }
}
