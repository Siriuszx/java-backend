package homework_29;

public class BankAccount implements PaymentSystem {
    private double currentBalance;

    public BankAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void transferMoney(String IBAN, double sum) {
        if(sum <= currentBalance) {
            currentBalance -= sum;
            System.out.printf("Sent %f to the %s\n", sum, IBAN);
        } else {
            System.out.println("Not enough money on the balance.");
        }
    }

    public double checkBalance() {
        return currentBalance;
    }

    public void withdrawMoney(double sum) {
        if(sum <= currentBalance) {
            currentBalance -= sum;
            System.out.printf("Withdrawn %f\n", sum);
        } else {
            System.out.println("Not enough money on the balance.");
        }
    }
}
