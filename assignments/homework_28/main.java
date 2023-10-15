package homework_28;

public class main {
    public static void main(String[] args) {
        Dictionary myDict = new Dictionary();

        myDict.put("Sommer", "Summer");
        myDict.put("Herbst", "Fall");
        myDict.put("Winter", "Winter");
        myDict.put("Fruhling", "Spring");

        String[] wordArr = new String[]{"Sommer", "Herbst", "Winter", "Fruhling"};

        System.out.println(myDict.get("Sommer"));

        String[] translatedWords = myDict.translator.translate(wordArr);

        for (int i = 0; i < wordArr.length; i++) {
            System.out.print(translatedWords[i] + " ");
        }
    }
}
