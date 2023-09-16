package homework_09;

import java.util.Scanner;

public class homework_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM");

        boolean isRunning = true;

        String currency = "EUR";

        int banknote5Count = 0;
        int banknote10Count = 0;
        int banknote20Count = 0;
        int banknote50Count = 54;
        int banknote100Count = 11;
        int banknote200Count = 15;

        int balance = 0;
        float savingsRate = 0.02f;

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
            System.out.println("4. Savings");
            System.out.println("0. Exit");

            int ans = scanner.nextInt();

            switch (ans) {
                case 1:
                    boolean notEnoughBanknotes = false;

                    int banknote200Diff = 0;
                    int banknote100Diff = 0;
                    int banknote50Diff = 0;
                    int banknote20Diff = 0;
                    int banknote10Diff = 0;
                    int banknote5Diff = 0;

                    System.out.println("Enter sum you want to withdraw: ");
                    int requestedSum = scanner.nextInt();

                    if (requestedSum <= balance) {
                        if (requestedSum % 5 == 0 && requestedSum != 0) {

                            // 200 Euro bills
                            int banknotes200ToWithdraw = requestedSum / 200;

                            if (banknotes200ToWithdraw > banknote200Count) {
                                notEnoughBanknotes = true;
                                banknote200Diff = banknotes200ToWithdraw - banknote200Count;

                                banknotes200ToWithdraw = banknote200Count;
                                requestedSum -= banknote200Count * 200;
                                banknote200Count = 0;
                            } else {
                                requestedSum -= banknotes200ToWithdraw * 200;
                                banknote200Count -= banknotes200ToWithdraw;
                            }

                            // 100 Euro bills
                            int banknotes100ToWithdraw = requestedSum / 100;

                            if (banknotes100ToWithdraw > banknote100Count) {
                                notEnoughBanknotes = true;
                                banknote100Diff = banknotes100ToWithdraw - banknote100Count;

                                banknotes100ToWithdraw = banknote100Count;
                                requestedSum -= banknotes100ToWithdraw * 100;
                                banknote100Count = 0;
                            } else {
                                requestedSum -= banknotes100ToWithdraw * 100;
                                banknote100Count -= banknotes100ToWithdraw;
                            }

                            // 50 Euro bills
                            int banknotes50ToWithdraw = requestedSum / 50;

                            if (banknotes50ToWithdraw > banknote50Count) {
                                notEnoughBanknotes = true;
                                banknote50Diff = banknotes50ToWithdraw - banknote50Count;

                                banknotes50ToWithdraw = banknote50Count;
                                requestedSum -= banknotes50ToWithdraw * 50;
                                banknote50Count = 0;
                            } else {
                                requestedSum -= banknotes50ToWithdraw * 50;
                                banknote50Count -= banknotes50ToWithdraw;
                            }

                            // 20 Euro bills
                            int banknotes20ToWithdraw = requestedSum / 20;

                            if (banknotes20ToWithdraw > banknote20Count) {
                                notEnoughBanknotes = true;
                                banknote20Diff = banknotes20ToWithdraw - banknote20Count;

                                banknotes20ToWithdraw = banknote20Count;
                                requestedSum -= banknotes20ToWithdraw * 20;
                                banknote20Count = 0;
                            } else {
                                requestedSum -= banknotes20ToWithdraw * 20;
                                banknote20Count -= banknotes20ToWithdraw;
                            }

                            // 10 Euro bills
                            int banknotes10ToWithdraw = requestedSum / 10;

                            if (banknotes10ToWithdraw > banknote10Count) {
                                notEnoughBanknotes = true;
                                banknote10Diff = banknotes10ToWithdraw - banknote10Count;

                                banknotes10ToWithdraw = banknote10Count;
                                requestedSum -= banknotes10ToWithdraw * 10;
                                banknote10Count = 0;
                            } else {
                                requestedSum -= banknotes10ToWithdraw * 10;
                                banknote10Count -= banknotes10ToWithdraw;
                            }

                            // 5 Euro bills
                            int banknotes5ToWithdraw = requestedSum / 5;

                            if (banknotes5ToWithdraw > banknote5Count) {
                                notEnoughBanknotes = true;
                                banknote5Diff = banknotes5ToWithdraw - banknote5Count;

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
                            if(notEnoughBanknotes) {
                                System.out.printf(
                                        "These is not enough banknotes for this transaction: \nWe need at least: \n200 Banknotes: %d\n100 Banknotes: %d\n50 Banknotes: %d\n20 Banknotes: %d\n10 Banknotes: %d\n5 Banknotes: %d\n",
                                        banknote200Diff,
                                        banknote100Diff,
                                        banknote50Diff,
                                        banknote20Diff,
                                        banknote10Diff,
                                        banknote5Diff
                                );

                                System.out.printf("Max amount available for withdrawal is: '%d' %s", totalSum, currency);
                            } else {
                                System.out.println("Please, take your money...");
                                System.out.printf("Amount withdrawn: '%d' %s\n", totalSum, currency);
                            }

                            System.out.println();
                        } else {
                            System.err.println("Please enter the valid amount of money you want to withdraw.");
                        }
                    } else {
                        System.err.println("Error: not enough money on your balance.");

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

                        System.out.printf("1. 200 %s banknotes\n", currency);
                        System.out.printf("2. 100 %s banknotes\n", currency);
                        System.out.printf("3. 50 %s banknotes\n", currency);
                        System.out.printf("4. 20 %s banknotes\n", currency);
                        System.out.printf("5. 10 %s banknotes\n", currency);
                        System.out.printf("6. 5 %s banknotes\n", currency);
                        System.out.println("0. Exit");

                        int depositAns = scanner.nextInt();

                        switch (depositAns) {
                            case 1:
                                System.out.printf("Please enter 200 %s banknote amount: \n", currency);
                                int deposit200Current = scanner.nextInt();
                                deposit200Count += deposit200Current;
                                System.out.printf("Deposited: '%d' %s\n", deposit200Current * 200, currency);
                                break;
                            case 2:
                                System.out.printf("Please enter 100 %s banknote amount: \n", currency);
                                int deposit100Current = scanner.nextInt();
                                deposit100Count += deposit100Current;
                                System.out.printf("Deposited: '%d' %s\n", deposit100Current * 100, currency);
                                break;
                            case 3:
                                System.out.printf("Please enter 50 %s banknote amount: \n", currency);
                                int deposit50Current = scanner.nextInt();
                                deposit50Count += deposit50Current;
                                System.out.printf("Deposited: '%d' %s\n", deposit50Current * 50, currency);
                                break;
                            case 4:
                                System.out.printf("Please enter 20 %s banknote amount: \n", currency);
                                int deposit20Current = scanner.nextInt();
                                deposit20Count += deposit20Current;
                                System.out.printf("Deposited: '%d' %s\n", deposit20Current * 20, currency);
                                break;
                            case 5:
                                System.out.printf("Please enter 10 %s banknote amount: \n", currency);
                                int deposit10Current = scanner.nextInt();
                                deposit10Count += deposit10Current;
                                System.out.printf("Deposited: '%d' %s\n", deposit10Current * 10, currency);
                                break;
                            case 6:
                                System.out.printf("Please enter 5 %s banknote amount: \n", currency);
                                int deposit5Current = scanner.nextInt();
                                deposit5Count += deposit5Current;
                                System.out.printf("Deposited: '%d' %s\n", deposit5Current * 5, currency);
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

                    System.out.printf("Your current balance: '%d' %s\n", balance, currency);

                    System.out.println();
                    break;
                case 4:
                    boolean isSavingsRunning = true;

                    int savings200Count = 0;
                    int savings100Count = 0;
                    int savings50Count = 0;
                    int savings20Count = 0;
                    int savings10Count = 0;
                    int savings5Count = 0;

                    while (isSavingsRunning) {
                        System.out.println();

                        System.out.println("Please choose banknotes you want to deposit: ");

                        System.out.printf("1. 200 %s banknotes\n", currency);
                        System.out.printf("2. 100 %s banknotes\n", currency);
                        System.out.printf("3. 50 %s banknotes\n", currency);
                        System.out.printf("4. 20 %s banknotes\n", currency);
                        System.out.printf("5. 10 %s banknotes\n", currency);
                        System.out.printf("6. 5 %s banknotes\n", currency);
                        System.out.println("0. Exit");

                        int savingsAns = scanner.nextInt();

                        switch (savingsAns) {
                            case 1:
                                System.out.printf("Please enter 200 %s banknote amount: \n", currency);
                                int savings200Current = scanner.nextInt();
                                savings200Count += savings200Current;
                                System.out.printf("Deposited: '%d' %s\n", savings200Current * 200, currency);
                                break;
                            case 2:
                                System.out.printf("Please enter 100 %s banknote amount: \n", currency);
                                int savings100Current = scanner.nextInt();
                                savings100Count += savings100Current;
                                System.out.printf("Deposited: '%d' %s\n", savings100Current * 100, currency);
                                break;
                            case 3:
                                System.out.printf("Please enter 50 %s banknote amount: \n", currency);
                                int savings50Current = scanner.nextInt();
                                savings50Count += savings50Current;
                                System.out.printf("Deposited: '%d' %s\n", savings50Current * 50, currency);
                                break;
                            case 4:
                                System.out.printf("Please enter 20 %s banknote amount: \n", currency);
                                int savings20Current = scanner.nextInt();
                                savings20Count += savings20Current;
                                System.out.printf("Deposited: '%d' %s\n", savings20Current * 20, currency);
                                break;
                            case 5:
                                System.out.printf("Please enter 10 %s banknote amount: \n", currency);
                                int savings10Current = scanner.nextInt();
                                savings10Count += savings10Current;
                                System.out.printf("Deposited: '%d' %s\n", savings10Current * 10, currency);
                                break;
                            case 6:
                                System.out.printf("Please enter 5 %s banknote amount: \n", currency);
                                int savings5Current = scanner.nextInt();
                                savings5Count += savings5Current;
                                System.out.printf("Deposited: '%d' %s\n", savings5Current * 5, currency);
                                break;
                            case 0:
                                isSavingsRunning = false;
                                break;
                            default:
                                System.err.println("Please enter the valid input.");
                                break;
                        }
                    }

                    int totalSavingsAmount = savings200Count * 200 +
                            savings100Count * 100 +
                            savings50Count * 50 +
                            savings20Count * 20 +
                            savings10Count * 10 +
                            savings5Count * 5;
                    if (totalSavingsAmount <= balance && totalSavingsAmount != 0) {

                        int savedIn5Months = 0;

                        for (int i = 0; i < 5; i++) {
                            savedIn5Months += (int) (totalSavingsAmount * savingsRate);
                            totalSavingsAmount += totalSavingsAmount * savingsRate;
                        }

                        System.out.printf("In 5 months you are gonna save: '%d' %s (%d %s)\n", savedIn5Months, currency, totalSavingsAmount, currency);
                    } else if (totalSavingsAmount >= balance) {
                        System.err.println("Error: not enough money on your balance.");
                    } else {
                        System.err.println("Error: invalid input.");
                    }
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
