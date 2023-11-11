package homework_45;

import java.sql.SQLOutput;
import java.util.*;

public class homework_45 {
    public static void main(String[] args) {
        CollectionComparison col = new CollectionComparison();

        List<Integer> numListOne = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> numListTwo = new ArrayList<>(List.of(3, 4, 5));

        System.out.printf("Intersection: %s\n\n", CollectionComparison.intersection(numListOne, numListTwo));

        System.out.println("Retrieval time:");
        System.out.printf("\tArrayList time: %d\n", col.timeComplexityRetrieval(col.getArrayList()));
        System.out.printf("\tLinkedList time: %d\n", col.timeComplexityRetrieval(col.getLinkedList()));

        System.out.println("Insertion time:");
        System.out.printf("\tArrayList time: %d\n", col.timeComplexityInsertion(col.getArrayList()));
        System.out.printf("\tLinkedList time: %d\n", col.timeComplexityInsertion(col.getLinkedList()));

        System.out.println("Deletion time:");
        System.out.printf("\tArrayList time: %d\n", col.timeComplexityDeletion(col.getArrayList()));
        System.out.printf("\tLinkedList time: %d\n", col.timeComplexityDeletion(col.getLinkedList()));

        System.out.println("\nArrayList time consumption:");
        System.out.println(
                col.timeComplexityRetrieval(col.getArrayList()) +
                        col.timeComplexityInsertion(col.getArrayList()) +
                        col.timeComplexityDeletion(col.getArrayList())
        );

        System.out.println("\nLinkedList time consumption:");
        System.out.println(
                col.timeComplexityRetrieval(col.getLinkedList()) +
                        col.timeComplexityInsertion(col.getLinkedList()) +
                        col.timeComplexityDeletion(col.getLinkedList())
        );
    }
}
