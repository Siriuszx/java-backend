package homework_46;

import java.util.*;


public class homework_46 {
    public static void main(String[] args) {
        String testString = "This string is used for \"string\" testing.";
        System.out.println(StringUtil.getUniqueSortedWords(testString));

        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(SetUtil.union(set1, set2));
        System.out.println(SetUtil.intersection(set1, set2));
        System.out.println(SetUtil.difference(set1, set2));

        // ----------------------------------------------------------------------------------------------------------

        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }

    public static char getFirstUniqueChar(String text) {
        char[] charArr = text.replaceAll("\\s+", "").toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j] && i != j) break;
                // Return character if character match wasn't found and the loop has reached its end
                if (j == charArr.length - 1) return charArr[i];
            }
        }

        return '.';
    }
}
