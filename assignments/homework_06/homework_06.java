package homework_06;

import java.util.Scanner;

public class homework_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a random number: ");
        int inputNum = scanner.nextInt();

        scanner.nextLine();

        System.out.println(homework_06.getNumStats(inputNum));
    }

    public static String getNumStats(int num) {
        String temp = "";

        boolean isDivisibleByTwo = num % 2 == 0;
        boolean isDivisibleByThree = num % 3 == 0;
        boolean isDivisibleByTwoAndThree = (num % 2 == 0) && (num % 3 == 0);

        temp = String.format(
                "Number: '%d'\nDivisible by 2: '%b'\nDivisible by 3: '%b'\nDivisible by 2 and 3: '%b'",
                num,
                isDivisibleByTwo,
                isDivisibleByThree,
                isDivisibleByTwoAndThree
        );

        if(num == 0)
            return "Please enter the valid number.";
        else
            return temp;
    }
}
