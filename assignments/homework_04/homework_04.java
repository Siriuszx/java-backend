package homework_04;

import java.util.Scanner;

public class homework_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scanner.nextLine();

        System.out.println("Enter your height: ");
        int height = scanner.nextInt();

        System.out.printf(
                "My name is %s, I am %d years old, I am from %s, my height is %d cm",
                (firstName + ' ' + lastName),
                age,
                cityName,
                height
        );
    }
}