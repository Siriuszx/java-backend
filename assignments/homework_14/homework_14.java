package homework_14;

public class homework_14 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 5, 2, 10, 11, 15};
        String[] strArr = new String[]{"hello", "world", "today", "is", "beautiful"};

        // Task 0
        // Написать метод принимающий целое число и проверяющий является ли число простым. Если является, метод должен вернуть true, не является - false
        System.out.println(isPrime(107));

        System.out.println("----------------------------------------");

        // Task 1 Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
        // Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
        System.out.println(getPrimeNumbersCount(numbers));

        System.out.println("----------------------------------------");

        // Task 3
        // Написать метод, принимающий на вход массив строк. Метод должен вернуть массив????, состоящий из самой короткой и самой длинной строки изначального массива.
        String[] wordAns = getLongShortStrings(strArr);

        for (int i = 0; i < wordAns.length; i++) {
            System.out.println(wordAns[i]);
        }

        System.out.println("----------------------------------------");
        // Task 4 опционально
        // Написать метод, принимающий на вход массив целых чисел.
        // Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

        int[] numArr = new int[]{0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primeNumArr = getPrimeNumArray(numArr);

        for (int i = 0; i < primeNumArr.length; i++) {
            System.out.println(primeNumArr[i]);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    public static int getPrimeNumbersCount(int[] primeNumbers) {
        int counter = 0;

        for (int i = 0; i < primeNumbers.length; i++) {
            if (isPrime(primeNumbers[i])) counter++;
        }

        return counter;
    }

    public static String[] getLongShortStrings(String[] stringArray) {
        if (stringArray.length <= 1) return null;

        String[] temp = new String[]{stringArray[0], stringArray[1]};

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() <= temp[0].length()) temp[0] = stringArray[i];
            if (stringArray[i].length() >= temp[1].length()) temp[1] = stringArray[i];
        }

        return temp;
    }

    public static int[] getPrimeNumArray(int[] numberArray) {
        if(numberArray.length < 1) return null;

        int primeNumCounter = 0;

        for (int i = 0; i < numberArray.length; i++) {
            if(isPrime(numberArray[i])) primeNumCounter++;
        }

        if(primeNumCounter == 0) return null;

        int[] temp = new int[primeNumCounter];
        primeNumCounter = 0;

        for (int i = 0; i < numberArray.length; i++) {
            if(isPrime(numberArray[i])) {
                temp[primeNumCounter] = numberArray[i];
                primeNumCounter++;
            }
        }

        return temp;
    }
}
