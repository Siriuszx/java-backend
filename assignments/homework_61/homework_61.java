package homework_61;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework_61 {
    public static void main(String[] args) {

        Matcher m1 = Pattern.compile("[0-7]").matcher("2.6.1990");
        while (m1.find()) System.out.println("matches1: " + m1.group());

        System.out.println("=================");

        Matcher m2 = Pattern.compile("[@&!]").matcher("myemail@example.co!m another&email@example.com");
        while (m2.find()) System.out.println("matches2: " + m2.group());

        System.out.println("=================");

        Matcher m3 = Pattern.compile("[A-Z]").matcher("London is the capital of Great Britain.");
        while (m3.find()) System.out.println("matches2: " + m3.group());

        System.out.println("=================");

        Matcher m4 = Pattern.compile("[bB]").matcher("Bears, Bees, and Bunnies are beautiful.");
        while (m4.find()) System.out.println("matches2: " + m4.group());
    }
}
