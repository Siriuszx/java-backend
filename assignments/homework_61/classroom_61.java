package homework_61;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classroom_61 {
    public static void main(String[] args) {

        //<editor-fold desc="regex pt. 1">
        //        // Pattern
//        // Matcher
//
//        // Pattern.compile(String regexp);
//        // pattern.matcher(String input);
//        // matcher.find(String input);
//        // matcher.matches()
//        // matcher.group()
//
//        Pattern pattern = Pattern.compile("a");
//        Matcher matcher = pattern.matcher("Jack is a cat");
//
//        while(matcher.find()) System.out.println(matcher.group());
//
//        Pattern pattern1 = Pattern.compile("cat");
//        Matcher matcher1 = pattern1.matcher("Test with cats and dogs");
//
//        while (matcher1.find()) System.out.println(matcher1.group());
//
//        Pattern pattern2 = Pattern.compile("12");
//        Matcher matcher2 = pattern1.matcher("sample text with 123 and 456");
//
//        while (matcher2.find()) System.out.println(matcher2.group());
//
//        Pattern pattern3 = Pattern.compile("1\\+1=2");
//        Matcher matcher3 = pattern1.matcher("1+1=2");
//
//        while (matcher3.find()) System.out.println(matcher3.group());
//
//        // [].^$*+?{}\() - special characters
//
//        Pattern pattern4 = Pattern.compile("aba");
//        Matcher matcher4 = pattern4.matcher("abababa");
//
//        int counter = 0;
//
//        while (matcher4.find()) {
//            System.out.println(matcher4.group());
//            counter++;
//        }
//
//        System.out.println("Matches found:" + counter);
        //</editor-fold>


        //<editor-fold desc="regex pt. 2">
        // [] - array of symbols
        // [x-y] - range of symbols
        Pattern pattern = Pattern.compile("[a-c]");
        Matcher matcher = pattern.matcher("acb");

        while (matcher.find()) System.out.println("matcher: " + matcher.group());

        System.out.println("======================");

        Pattern pattern1 = Pattern.compile("[0-5]");
        Matcher matcher1 = pattern1.matcher("01230985");

        while (matcher1.find()) System.out.println("matcher: " + matcher1.group());

        System.out.println("======================");

        Pattern pattern2 = Pattern.compile("[0-5]");
        Matcher matcher2 = pattern2.matcher("01230985");


        while (matcher2.find()) System.out.println("matcher: " + matcher2.group());

        System.out.println("======================");

        Pattern pattern3 = Pattern.compile("[0-5A-z]");
        Matcher matcher3 = pattern3.matcher("174dAB");

        while (matcher3.find()) System.out.println("matcher: " + matcher3.group());

        System.out.println("======================");

        Matcher matcher4 = Pattern.compile("[^a^bc]").matcher("acdeA^BC123-%");

        while (matcher4.find()) System.out.println("matcher: " + matcher4.group());

        //</editor-fold>
    }
}
