package homework_29;

public interface PaymentSystem {
    void transferMoney(String IBAN, double sum);
    void withdrawMoney(double sum);
    double checkBalance();
}
