package homework_29;

public class homework_29 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        ElectronicWallet electronicWallet = new ElectronicWallet(1000);

        System.out.println(bankAccount.checkBalance());
        System.out.println(electronicWallet.checkBalance());

        System.out.println("----------------------------");

        bankAccount.transferMoney("DE000000000000", 1001);
        electronicWallet.transferMoney("DE000000000000", 1000);

        System.out.println("----------------------------");

        System.out.println(bankAccount.checkBalance());
        System.out.println(electronicWallet.checkBalance());
    }
}
