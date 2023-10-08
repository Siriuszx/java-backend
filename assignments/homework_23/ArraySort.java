package homework_23;

public class ArraySort {
    public static int[] bubbleSort(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static void mergeSort(int[] array) {
        int length = array.length;

        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int j = 0;

        for (int i = 0; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftLength = array.length / 2;
        int rightLength = array.length - leftLength;

        int i = 0;
        int left = 0;
        int right = 0;

        while (left < leftLength && right < rightLength) {
            if (leftArray[left] < rightArray[right]) {
                array[i] = leftArray[left];
                i++;
                left++;
            } else {
                array[i] = rightArray[right];
                i++;
                right++;
            }
        }

        while (left < leftLength) {
            array[i] = leftArray[left];
            i++;
            left++;
        }

        while (right < rightLength) {
            array[i] = rightArray[right];
            i++;
            right++;
        }
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
