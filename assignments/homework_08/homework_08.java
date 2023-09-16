package homework_08;

import java.util.Scanner;

public class homework_08 {
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

        // Task 1 (Использовать оператор switch)
        System.out.println("Please choose the number form 1 to 7: ");
        int numAns = scanner.nextInt();

        switch (numAns) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error: invalid answer.");
                break;
        }

        // Task 2 Реализовать с использованием switch Ваш ребенок принес оценку за контрольную работу по математике.
        // В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
        // Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
        // (Оставшееся время не может быть больше 1 часа) На сегодня у него осталось 45 минут. (записать в переменную)

        int rndSchoolGrade = (int) (Math.random() * 12 + 1);
//        rndSchoolGrade = -1;

        System.out.printf("School grade today: '%d'", rndSchoolGrade);

        System.out.println();

        final int maxMinutesAllowed = 60;
        int minutesLeft = 45;
        int bonusMinutes = 0;
        String parentFeedback = "";

        switch (rndSchoolGrade) {
            case 10, 11, 12:
                bonusMinutes = 60;
                parentFeedback = "I am so happy for you sweetheart!";
                break;
            case 7, 8, 9:
                bonusMinutes = 45;
                parentFeedback = "Well done!";
                break;
            case 4, 5, 6:
                bonusMinutes = 15;
                parentFeedback = "Do better next time.";
                break;
            case 3:
                bonusMinutes = -30;
                parentFeedback = "I am so disappointed in you.";
                break;
            case 0, 1, 2:
                minutesLeft = 0;
                parentFeedback = "Run.";
                break;
            default:
                System.out.println("Error: invalid input.");
                break;
        }

        if (!parentFeedback.isEmpty()) {
            minutesLeft = getTVMinutes(
                    minutesLeft,
                    bonusMinutes,
                    maxMinutesAllowed
            );

            System.out.printf(
                    "Parent feedback: '%s'\nYou can watch TV today for: '%d minutes'",
                    parentFeedback,
                    minutesLeft
            );
        }
    }

    public static int getTVMinutes(int minutesLeft, int bonusMinutes, int maxMinutesAllowed) {
        int watchTVMinutes = Math.min((minutesLeft + bonusMinutes), maxMinutesAllowed);

        return Math.max(watchTVMinutes, 0);
    }
}
