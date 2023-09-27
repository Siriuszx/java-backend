package homework_16;

public class homework_16 {
    public static void main(String[] args) {

        // Task 0
        //
        // Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.

        String string1 = "This is my string!!! 1 + 2 = 3";

        System.out.println(transformToUpperCase(string1));

        System.out.println("------------------------------------------");

        // Task 1
        //
        // Написать метод swap, принимающий на вход массив целых чисел, и два индекса. Метод должен поменять местами значения, хранящихся в этих индексах

        int[] numArray = new int[]{0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[]{"This", "is", "something", "new", "to", "me", "!"};

        int[] newNumArray = swap(numArray, 1, 5);
        String[] newStringArray = swap(stringArray, 1, 5);

        for (int i = 0; i < newNumArray.length; i++) {
            System.out.println(newNumArray[i]);
        }

        System.out.println("------------------------------------------");

        for (int i = 0; i < newStringArray.length; i++) {
            System.out.println(newStringArray[i]);
        }

        System.out.println("------------------------------------------");

        //Task 2
        //
        // Написать метод, принимающий строку и один или два индекса (перегрузка).
        // Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
        // Если индекс 1 - начиная с индекса и до конца строки.
        String rndString = "Entschuldigung";

        System.out.println(substring(rndString, 0, 3));
        System.out.println(substring(rndString, 3));

        System.out.println("------------------------------------------");

        // Task 3
        //
        // Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.

        String[] newStringArray2 = new String[]{"some", "random", "words", "in", "my", "array"};

        System.out.printf("Word I am looking for is at index: %d\n", findStringIndex(newStringArray2, "array"));

        System.out.println("------------------------------------------");

        // Task 4
        //
        // Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
        // переведенных в верхний регистр. Распечатать полученный результат в методе main

        String rndWord2 = "Hello";
        String rndWord3 = "He";
        System.out.println(middleToUpperCase(rndWord2));
        System.out.println(middleToUpperCase(rndWord3));

        System.out.println("------------------------------------------");

        // Task 5
        // Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход массив и определяет сумму его элементов.

        int[] rndNums = new int[]{1, 2, 3, 4};

        System.out.printf("Sum of nums is: %d", sumOfArray(rndNums));

    }

    public static String transformToUpperCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z')
                charArray[i] = (char) (charArray[i] - 32);
        }

        return new String(charArray);
    }

    public static int[] swap(int[] numArr, int firstIndex, int secondIndex) {
        if (!(firstIndex >= 0 && firstIndex <= numArr.length - 1 && secondIndex >= 0 && secondIndex <= numArr.length - 1))
            return null;

        int temp = numArr[secondIndex];
        numArr[secondIndex] = numArr[firstIndex];
        numArr[firstIndex] = temp;

        return numArr;
    }

    public static String[] swap(String[] stringArr, int firstIndex, int secondIndex) {
        if (!(firstIndex >= 0 && firstIndex <= stringArr.length - 1 && secondIndex >= 0 && secondIndex <= stringArr.length - 1))
            return null;

        String temp = stringArr[secondIndex];
        stringArr[secondIndex] = stringArr[firstIndex];
        stringArr[firstIndex] = temp;

        return stringArr;
    }

    public static String substring(String input, int firstIndex, int secondIndex) {
        char[] charArray = input.toCharArray();
        String temp = "";

        for (int i = firstIndex; i < secondIndex; i++) {
            temp += String.valueOf(charArray[i]);
        }
        return temp;
    }

    public static String substring(String input, int firstIndex) {
        char[] charArray = input.toCharArray();
        String temp = "";

        for (int i = firstIndex; i < charArray.length; i++) {
            temp += String.valueOf(charArray[i]);
        }
        return temp;
    }

    public static int findStringIndex(String[] stringArray, String value) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(value)) return i;
        }

        // It's better to 'throw an error' than give a wrong value.
        return -1;
    }

    public static String middleToUpperCase(String input) {
        if (input.length() < 2)
            return null;

        if (input.length() == 2) return input.substring(1, 2).toUpperCase();

        return input.substring(1, 3).toUpperCase();
    }

    public static int sumOfArray(int[] numArray) {
        int accu = 0;

        for (int i = 0; i < numArray.length; i++) {
            accu += numArray[i];
        }

        return accu;
    }
}
