package homework_51.homework_51;

public class homework_51 {
    public static void main(String[] args) {
        FilterIO fio = new FilterIO("./src/homework_51/homework_51/");

        fio.writeDepositHistory(fio.getDepositHistory("transactionHistory.txt"), 2000);
    }
}
