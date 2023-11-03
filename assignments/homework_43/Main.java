package homework_43;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        document.publish();
        document.correct();

        document.delete();

        document.correct();
        document.publish();
    }
}
