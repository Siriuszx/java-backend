package homework_54;

import java.util.*;
import java.util.stream.*;

public class homework_54 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(10, 20, 431, 23, 21, 9, -1, 2, 39, 5, 9));

        System.out.print("[ ");
        filterSort(ints).forEach(el -> System.out.print(el + " "));
        System.out.print("]");

        System.out.println("\n  ---------------------------------------------------------------------------------------");

        String text = "Hello world and good afternoon";
        System.out.println("Char count: " + countChars(text));
    }

    public static List<Integer> filterSort(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num > 10)
                .sorted((x, y) -> ((x % 10) - (y % 10)) > 0 ? 1 : -1)
                .collect(Collectors.toList());
    }

    public static int countChars(String strings) {
        return Arrays.stream(strings.split(" "))
                .map(String::length)
                .filter(length -> length > 4)
                .reduce(0, Integer::sum);
    }
}
