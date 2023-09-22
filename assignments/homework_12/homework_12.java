package homework_12;

import java.util.Scanner;

public class homework_12 {
    public static void main(String[] args) {

        // Task 0
        //
        // Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.

        int[] numArr = new int[20];
        int evenNumberCount = 0;
        int evenNumberSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 100);

            System.out.println(numArr[i]);

            if (numArr[i] % 2 == 0) {
                evenNumberCount++;
                evenNumberSum += numArr[i];
            }
        }

        System.out.printf("Even number count: %d\n", evenNumberCount);
        System.out.printf("Even number sum: %d\n", evenNumberSum);

        // Task 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter deposit sum: ");
        float depositSum = scanner.nextFloat();

        System.out.println("Enter deposit length: ");
        int depositLength = scanner.nextInt();

        float depositMultiplier = 0.07f;

        for (int i = 0; i < depositLength; i++) {
            depositSum += depositSum * depositMultiplier;
        }

        System.out.printf("Deposit in %d months: %f", depositLength, depositSum);

        // Task 2
        //
        // Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве. Простое число - число, которое делится на цело только на 1 и само себя.
        //
        // Пример простых чисел: 3, 5, 7, 11, 13 и т.д.

        int[] rndNumArr = new int[50];

        for (int i = 0; i < rndNumArr.length; i++) {
            rndNumArr[i] = (int) (Math.random() * 101);

            if(isPrime(rndNumArr[i]))
                System.out.println(rndNumArr[i]);

        }

        // Task3 *опционально Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
        String temp = "";

        for (int i = 1; i <= 6; i++) {
            temp += i;
            System.out.println(temp);
        }
    }
    
    public static boolean isPrime(int primeNum) {
        if(primeNum <= 1)  return false;

        if (primeNum == 2 || primeNum == 3) return true;

        for (int i = 2; i < primeNum; i++) {
            if(primeNum % i == 0) return false;
        }

        return true;
    }
}
