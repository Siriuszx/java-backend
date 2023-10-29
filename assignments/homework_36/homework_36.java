package homework_36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class homework_36 {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        List<Integer> intsList = new ArrayList<>(Arrays.asList(integers));
//      [2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output

        System.out.println("Default array list: " + intsList);

        System.out.println("--------------------------------------------------");

        Comparator<Integer> comp = (i, j) -> {
            boolean intIEven = (i % 2) == 0;
            boolean intJEven = (j % 2) == 0;

            if (intIEven && !intJEven)
                return -1;
            else if (!intIEven && intJEven)
                return 1;
            else {
                if(i > j)
                    return 1;
                else
                    return -1;
            }
        };

        intsList.sort(comp);

        System.out.println("Sorted in order: " + intsList);

        System.out.println("--------------------------------------------------");

        Comparator<Integer> newComp = (i, j) -> {
            boolean intIEven = (i % 2) == 0;
            boolean intJEven = (j % 2) == 0;

            if (intIEven && !intJEven)
                return -1;
            else if (!intIEven && intJEven)
                return 1;
            else {
                if(i > j)
                    return -1;
                else
                    return 1;
            }
        };
//      [2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output

        intsList.sort(newComp);

        System.out.println("Sorted reversed: " + intsList);
    }
}
