package homework_13;

public class homework_13 {
    public static void main(String[] args) {
        // Task 0
        //
        // Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности

        int[] rndArr1 = new int[]{1, 4, 3, 6, 7};

        printArrReverse(rndArr1);

        System.out.println("-----------");

        printArrReverse(rndArr1, 2);

        System.out.println("-----------");

        printArrReverse(rndArr1, false);

        System.out.println("-----------");

        // Task 1
        //
        // Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число
        //
        // класс Math для нахождения степени числа использовать нельзя ;)

        System.out.println(powTwo(4));

        System.out.println("-----------");

        // Task 2 опционально
        //
        // Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
        //
        // на вход принимает массив целых чисел и число - длинну нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

        int[] rndArr2 = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] rndArr2Copy = copyOfArr(rndArr2, 3);

        for (int i = 0; i < rndArr2Copy.length; i++) {
            System.out.println(rndArr2Copy[i]);
        }

        System.out.println("-----------");

        // Task 3 опционально
        //
        // Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент, который будет находиться на k-й позиции в объединенном отсортированном массиве.

        int[] rndArr3 = new int[]{100, 112, 256, 349, 770};
        int[] rndArr4 = new int[]{72, 86, 113, 119, 265, 445, 892};
        int kPosition = 7;

        int unionElement = getUnionElement(rndArr3, rndArr4, 7);

        System.out.printf("Union element: %d", unionElement);

        System.out.println("-----------");
    }

    public static void printArrReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void printArrReverse(int[] array, int startIndex) {
        for (int i = 0; i < startIndex; i++) {
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i > startIndex - 1; i--) {
            System.out.println(array[i]);
        }
    }

    public static void printArrReverse(int[] array, boolean isReversed) {
        if (isReversed) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static int powTwo(int num) {
        int accu = 2;

        for (int i = 0; i < num - 1; i++) {
            accu *= 2;
        }

        return accu;
    }

    public static int[] copyOfArr(int[] array, int index) {
        int[] accu = new int[3];

        for (int i = 0; i < accu.length; i++) {
            accu[i] = array[i];
        }

        return accu;
    }

    public static int[] sort(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        return array;
    }

    public static int getUnionElement(int[] arrayOne, int[] arrayTwo, int index) {
        int[] accu = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < arrayOne.length; i++) {
            accu[i] = arrayOne[i];
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            accu[i + arrayOne.length - 1] = arrayTwo[i];
        }

        return sort(accu)[index];
    }
}
