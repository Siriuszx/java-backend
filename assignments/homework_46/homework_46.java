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
    }
}
