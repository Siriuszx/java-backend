package homework_53;

import java.util.*;
import java.util.stream.Collectors;

public class homework_53 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("hello", "hello", "world", "I", "love", "strict", "typing"));
        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Bob", 21, "California"));
        peopleList.add(new Person("John", 22, "California"));
        peopleList.add(new Person("Alex", 18, "New York"));

        filterSort(strings, 'h').forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------");

        filterPeople(peopleList, "California", 20).forEach(System.out::println);

    }

    public static List<String> filterSort(List<String> strings, char filterChar) {
        return strings.stream()
                .distinct()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }

    public static List<Person> filterPeople(List<Person> personList, String city, int age) {
        return personList.stream()
                .filter(person -> (person.city.equals(city)) && (person.age > age))
                .collect(Collectors.toList());
    }
}
