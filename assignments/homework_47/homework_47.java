package homework_47;

import java.util.*;

public class homework_47 {
    public static void main(String[] args) {
        String text = "sample text and sample text and sample text...";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();

        // -----------------------------------------------------------------------------------------------------------

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // -----------------------------------------------------------------------------------------------------------

        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");
        directFlights.put("Austin", "Las Vegas");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        List<String> route2 = findRoute(directFlights, "Austin", "Denver");
        System.out.println(route); // ["Boston", "Miami", "New York", "Chicago", "Denver", "Las Vegas"]
        System.out.println(route2); // []
    }

    public static Map<String, Integer> frequencyDictionary(String text) {
        String[] wordArr = text.split("\\W+");

        Map<String, Integer> tempMap = new HashMap<>();

        for (String word : wordArr) {
            if (!tempMap.containsKey(word))
                tempMap.putIfAbsent(word, 1);
            else
                tempMap.replace(word, tempMap.get(word) + 1);
        }

        return tempMap;
    }

    public static Map<Character, Integer> frequencyCharsDictionary(String text) {
        char[] charArr = text.replaceAll("\\W+", "").toCharArray();

        Map<Character, Integer> tempMap = new HashMap<>();

        for (char ch : charArr) {
            if (!tempMap.containsKey(ch))
                tempMap.putIfAbsent(ch, 1);
            else
                tempMap.replace(ch, tempMap.get(ch) + 1);
        }

        return tempMap;
    }

    public static Map<String, Integer> intersection(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
        Map<String, Integer> mapInter = new HashMap<>(mapOne);
        String[] keys = mapInter.keySet().toArray(new String[0]);

        Arrays.stream(keys).forEach(key -> {
            if (!mapTwo.containsKey(key)) mapInter.remove(key);
        });

        return mapInter;
    }

    public static List<String> findRoute(Map<String, String> flightPaths, String start, String destination) {
        List<String> route = new ArrayList<>();

        // Input validation
        if(flightPaths == null || !flightPaths.containsKey(start) || !flightPaths.containsValue(destination))
            return route;

        if (flightPaths.get(start).equals(destination)) {
            route.add(start);
            route.add(destination);
        } else {
            String nextTransition = flightPaths.get(start);

            if(nextTransition == null) return route;

            route.add(start);

            while (!nextTransition.equals(destination)) {
                // Executed if the program fails to find flight connection WHILE establishing route
                if(!flightPaths.containsKey(nextTransition)) {
                    route.clear();
                    return route;
                }

                // Used as pathfinding algorithm
                if (!flightPaths.get(nextTransition).equals(destination)) {
                    route.add(nextTransition);
                } else {
                    route.add(nextTransition);
                    route.add(destination);
                }

                // Used to define next flight connection
                nextTransition = flightPaths.get(nextTransition);
            }
        }

        return route;
    }
}