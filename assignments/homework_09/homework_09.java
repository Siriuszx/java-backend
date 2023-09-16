package homework_09;

import java.util.Scanner;

public class homework_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM");

        boolean isRunning = true;

        String currency = "EUR";

        int banknote5Count = 0;
        int banknote10Count = 10;
        int banknote20Count = 23;
        int banknote50Count = 54;
        int banknote100Count = 11;
        int banknote200Count = 15;

        int balance = 0;

        balance = banknote5Count * 5 +
                banknote10Count * 10 +
                banknote20Count * 20 +
                banknote50Count * 50 +
                banknote100Count * 100 +
                banknote200Count * 200;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Account balance");
            System.out.println("0. Exit");

            int ans = scanner.nextInt();

            switch (ans) {
                case 1:
                    System.out.println("Enter sum you want to withdraw: ");
                    int requestedSum = scanner.nextInt();

                    if (requestedSum <= balance) {
                        if (requestedSum % 5 == 0 && requestedSum != 0) {

                            // 200 Euro bills
                            int banknotes200ToWithdraw = requestedSum / 200;

                            if (banknotes200ToWithdraw >= banknote200Count) {
                                banknotes200ToWithdraw = banknote200Count;
                                requestedSum -= banknote200Count * 200;
                                banknote200Count = 0;
                            } else {
                                requestedSum -= banknotes200ToWithdraw * 200;
                                banknote200Count -= banknotes200ToWithdraw;
                            }

                            // 100 Euro bills
                            int banknotes100ToWithdraw = requestedSum / 100;

                            if (banknotes100ToWithdraw >= banknote100Count) {
                                banknotes100ToWithdraw = banknote100Count;
                                requestedSum -= banknotes100ToWithdraw * 100;
                                banknote100Count = 0;
                            } else {
                                requestedSum -= banknotes100ToWithdraw * 100;
                                banknote100Count -= banknotes100ToWithdraw;
                            }

                            // 50 Euro bills
                            int banknotes50ToWithdraw = requestedSum / 50;

                            if (banknotes50ToWithdraw >= banknote50Count) {
                                banknotes50ToWithdraw = banknote50Count;
                                requestedSum -= banknotes50ToWithdraw * 50;
                                banknote50Count = 0;
                            } else {
                                requestedSum -= banknotes50ToWithdraw * 50;
                                banknote50Count -= banknotes50ToWithdraw;
                            }

                            // 20 Euro bills
                            int banknotes20ToWithdraw = requestedSum / 20;

                            if (banknotes20ToWithdraw >= banknote20Count) {
                                banknotes20ToWithdraw = banknote20Count;
                                requestedSum -= banknotes20ToWithdraw * 20;
                                banknote20Count = 0;
                            } else {
                                requestedSum -= banknotes20ToWithdraw * 20;
                                banknote20Count -= banknotes20ToWithdraw;
                            }

                            // 10 Euro bills
                            int banknotes10ToWithdraw = requestedSum / 10;

                            if (banknotes10ToWithdraw >= banknote10Count) {
                                banknotes10ToWithdraw = banknote10Count;
                                requestedSum -= banknotes10ToWithdraw * 10;
                                banknote10Count = 0;
                            } else {
                                requestedSum -= banknotes10ToWithdraw * 10;
                                banknote10Count -= banknotes10ToWithdraw;
                            }

                            // 5 Euro bills
                            int banknotes5ToWithdraw = requestedSum / 5;

                            if (banknotes5ToWithdraw >= banknote5Count) {
                                banknotes5ToWithdraw = banknote5Count;
                                requestedSum -= banknotes5ToWithdraw * 5;
                                banknote5Count = 0;
                            } else {
                                requestedSum -= banknotes5ToWithdraw * 5;
                                banknote5Count -= banknotes5ToWithdraw;
                            }

                            //Total sum available for withdrawal
                            int totalSum =
                                    banknotes200ToWithdraw * 200 +
                                            banknotes100ToWithdraw * 100 +
                                            banknotes50ToWithdraw * 50 +
                                            banknotes20ToWithdraw * 20 +
                                            banknotes10ToWithdraw * 10 +
                                            banknotes5ToWithdraw * 5;

                            System.out.println("Please, take your money...");
                            System.out.printf("Amount withdrawn: '%d' %s", totalSum, currency);

                            System.out.println();
                        } else {
                            System.err.println("Please enter the valid amount of money you want to withdraw.");
                        }
                    } else {
                        System.err.println("Not enough money on your balance.");

                        System.out.println();
                    }
                    break;
                case 2:
                    boolean isDepositRunning = true;

                    int deposit200Count = 0;
                    int deposit100Count = 0;
                    int deposit50Count = 0;
                    int deposit20Count = 0;
                    int deposit10Count = 0;
                    int deposit5Count = 0;

                    while (isDepositRunning) {
                        System.out.println();

                        System.out.println("Please choose banknotes you want to deposit: ");

                        System.out.printf("1. 200 %s banknotes", currency);
                        System.out.printf("2. 100 %s banknotes", currency);
                        System.out.printf("3. 50 %s banknotes", currency);
                        System.out.printf("4. 20 %s banknotes", currency);
                        System.out.printf("5. 10 %s banknotes", currency);
                        System.out.printf("6. 5 %s banknotes", currency);
                        System.out.println("0. Exit");

                        int depositAns = scanner.nextInt();

                        switch (depositAns) {
                            case 1:
                                System.out.printf("Please enter 200 %s banknote amount: ", currency);
                                int deposit200Current = scanner.nextInt();
                                deposit200Count += deposit200Current;
                                System.out.printf("Deposited: '%d' %s", deposit200Current * 200, currency);
                                break;
                            case 2:
                                System.out.printf("Please enter 100 %s banknote amount: ", currency);
                                int deposit100Current = scanner.nextInt();
                                deposit100Count += deposit100Current;
                                System.out.printf("Deposited: '%d' %s", deposit100Current * 100, currency);
                                break;
                            case 3:
                                System.out.printf("Please enter 50 %s banknote amount: ", currency);
                                int deposit50Current = scanner.nextInt();
                                deposit50Count += deposit50Current;
                                System.out.printf("Deposited: '%d' %s", deposit50Current * 50, currency);
                                break;
                            case 4:
                                System.out.printf("Please enter 20 %s banknote amount: ", currency);
                                int deposit20Current = scanner.nextInt();
                                deposit20Count += deposit20Current;
                                System.out.printf("Deposited: '%d' %s", deposit20Current * 20, currency);
                                break;
                            case 5:
                                System.out.printf("Please enter 10 %s banknote amount: ", currency);
                                int deposit10Current = scanner.nextInt();
                                deposit10Count += deposit10Current;
                                System.out.printf("Deposited: '%d' %s", deposit10Current * 10, currency);
                                break;
                            case 6:
                                System.out.printf("Please enter 5 %s banknote amount: ", currency);
                                int deposit5Current = scanner.nextInt();
                                deposit5Count += deposit5Current;
                                System.out.printf("Deposited: '%d' %s", deposit5Current * 5, currency);
                                break;
                            case 0:
                                isDepositRunning = false;
                                break;
                            default:
                                System.err.println("Please enter the valid input.");
                                break;
                        }
                    }

                    int totalAmountDeposited = deposit200Count * 200 +
                            deposit100Count * 100 +
                            deposit50Count * 50 +
                            deposit20Count * 20 +
                            deposit10Count * 10 +
                            deposit5Count * 5;

                    banknote200Count += deposit200Count;
                    banknote100Count += deposit100Count;
                    banknote50Count += deposit50Count;
                    banknote20Count += deposit20Count;
                    banknote10Count += deposit10Count;
                    banknote5Count += deposit5Count;

                    System.out.printf("Deposited: '%d' %s\n", totalAmountDeposited, currency);
                    break;
                case 3:
                    balance = banknote5Count * 5 +
                            banknote10Count * 10 +
                            banknote20Count * 20 +
                            banknote50Count * 50 +
                            banknote100Count * 100 +
                            banknote200Count * 200;
                    System.out.printf("Your current balance: '%d' %s", balance, currency);

                    System.out.println();
                    break;
                case 0:
                    System.out.println("Thank you for using our services!");
                    isRunning = false;
                    break;
                default:
                    System.err.println("Please enter the valid input.");
                    break;
            }
        }
    }
}
