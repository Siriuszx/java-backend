package homework_29;

public class ElectronicWallet implements PaymentSystem {
    private double currentBalance;

    public ElectronicWallet(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void transferMoney(String IBAN, double sum) {
        if (sum <= currentBalance) {
            currentBalance -= sum;
            System.out.printf("Sent %f to the %s\n", sum, IBAN);
        } else {
            System.out.println("Not enough money on the balance.");
        }
    }

    public void withdrawMoney(double sum) {
        if(sum <= currentBalance) {
            currentBalance -= sum;
            System.out.printf("Withdrawn %f from your bank account.\n", sum);
        } else {
            System.out.println("Not enough money on your bank account.");
        }
    }

    public double checkBalance() {
        return currentBalance;
    }
}
