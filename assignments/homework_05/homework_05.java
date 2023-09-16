package homework_05;

public class homework_05 {
    public static void main(String[] args) {
        // Task 01
        String myName = "Andrii";

        System.out.printf("My name contains '%d' characters \n", myName.length());

        char firstChar = myName.charAt(0);
        char lastChar = myName.charAt(myName.length() - 1);

        System.out.printf("First char dec value: '%s' \n", Integer.toString(firstChar, 10));
        System.out.printf("Last char dec value: '%s' \n", Integer.toString(lastChar, 10));

        System.out.println();

        // Task 02 Создайте строки:
        String string1 = "Java ";
        String string2 = "is ";
        String string3 = "a ";
        String string4 = "powerful ";
        String string5 = "language ";

        System.out.println();

        // Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"
        String ans1 = string1 + string2 + string3 + string4 + string5;
        String ans2 = string1
                .concat(string2)
                .concat(string3)
                .concat(string4)
                .concat(string5);

        System.out.println(ans1);
        System.out.println("Char length: " + ans1.length());

        System.out.println(ans2);
        System.out.println("Char length: " + ans2.length());

        System.out.println();

        // Task 02.2 Заменить в результирующей строке слово "powerful" на "super" Содержит ли строка подстроку "age"? Создайте переменную boolean типа c ответом
        System.out.println(ans1.replace("powerful", "super"));

        System.out.println();

        // Task 03 *опционально Необходимо распечатать два средних символа строки. Например, если дана строка "string" - результат будет "ri", для строки "code" результат "od",
        // для "Practice" результат "ct".

        String task03String1 = "string";
        String task03String2 = "code";
        String task03String3 = "Practice";
        String task03String4 = "Hello";

        System.out.println(homework_05.getMiddleCharacters(task03String1));
        System.out.println(homework_05.getMiddleCharacters(task03String2));
        System.out.println(homework_05.getMiddleCharacters(task03String3));
        System.out.println(homework_05.getMiddleCharacters(task03String4));
    }

    public static String getMiddleCharacters(String word) {
        if (word.length() % 2 == 0)
            return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        else
            return word.substring(word.length() / 2, (word.length() / 2) + 1);
    }
}
