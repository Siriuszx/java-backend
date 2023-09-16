package homework_07;

import java.util.Scanner;

public class homework_07 {
    public static void main(String[] args) {

        // Task 0
        Scanner scanner = new Scanner(System.in);

        int chosenNum;

        System.out.println("Please choose 1, 2 or 3: ");
        chosenNum = scanner.nextInt();

        scanner.nextLine();

        switch (chosenNum) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Please choose a valid option.");
                break;
        }

        // Task 1
        int[] randomNums = new int[4];

        randomNums[0] = (int) ((Math.random() * 100) + 1);
        randomNums[1] = (int) ((Math.random() * 100) + 1);
        randomNums[2] = (int) ((Math.random() * 100) + 1);
        randomNums[3] = (int) ((Math.random() * 100) + 1);

        System.out.printf(
                "Random numbers: '%d' '%d' '%d' '%d'",
                randomNums[0],
                randomNums[1],
                randomNums[2],
                randomNums[3]
        );

        System.out.println("\n");

        int biggestInt = 0;

        for (int i = 0; i < 4; i++) {
            if (randomNums[i] > biggestInt) biggestInt = randomNums[i];
        }

        System.out.printf("Biggest int: '%d'", biggestInt);

        // Task 2 *Повышенной сложности (опционально)
        String strInput = "";

        System.out.println("Please enter a four-digit number: ");
        strInput = scanner.nextLine();

        if (strInput.length() == 4 && homework_07.isInteger(strInput)) {
            char[] charArray = strInput.toCharArray();

            if ((int) charArray[0] + (int) charArray[1] == (int) charArray[2] + (int) charArray[3])
                System.out.printf("%s is a happy number!", strInput);
            else
                System.out.printf("%s is NOT a happy number.", strInput);
        } else {
            System.out.println("Error: not a valid number.");
        }
    }

    public static boolean isInteger(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit((int) value.charAt(i)))
                return false;
        }
        return true;
    }
}