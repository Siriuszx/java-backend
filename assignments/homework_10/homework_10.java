package homework_10;

import java.util.Scanner;

public class homework_10 {
    public static void main(String[] args) {

        // Task 0 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
        int whileIndex = 1;

        while (whileIndex <= 10) {
            System.out.printf("Task%d\n", whileIndex);
            whileIndex++;
        }

        // Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
        int doWhileIndex = 1;

        do {
            if (doWhileIndex % 5 == 0) System.out.println(doWhileIndex);
            doWhileIndex++;
        } while (doWhileIndex <= 100);

        // Task 2 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
        int whileIndex2 = 1;

        int indexLimit = 0;

        while (whileIndex2 <= 100) {
            if (indexLimit == 7) break;
            if (whileIndex2 % 5 == 0) {
                System.out.println(whileIndex2);
                indexLimit++;
            }
            whileIndex2++;
        }

        // Task 3 Программа просит пользователя слово "hello" Если пользователь вводит правильное слово - программа распечатывает на экран благодарность и завершает работу
        // Если вводится не верное слово - программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
        //
        // *опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
        // По окончанию - вывести число попыток на экран
        Scanner scanner = new Scanner(System.in);

        int numberOfAttempts = 0;

        while (true) {
            numberOfAttempts++;

            System.out.println("Please say 'hello':");

            if(scanner.nextLine().equals("hello")) {
                System.out.println("Thank you!");
                System.out.printf("Number of attempts: %d\n", numberOfAttempts);
                break;
            } else {
                System.out.printf("Number of attempts: %d\n", numberOfAttempts);
            }
        }

        // Task 4 Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа

        System.out.println("Please enter a random number: ");

        char[] ans = scanner.nextLine().toCharArray();
        int sum = 0;

        for (int i = 0; i < ans.length; i++) {
            sum += Integer.parseInt(String.valueOf(ans[i]));
        }

        System.out.printf("The sum is: %d", sum);
    }
}
