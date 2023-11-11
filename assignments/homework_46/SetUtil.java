package homework_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetUtil {
    public static Set<String> union(Set<String> setOne, Set<String> setTwo) {
        Set<String> unionSet = new HashSet<>(setOne);

        unionSet.addAll(setTwo);

        return unionSet;
    }

    public static Set<String> intersection(Set<String> setOne, Set<String> setTwo) {
        Set<String> interSet = new HashSet<>(setOne);

        interSet.retainAll(setTwo);

        return interSet;
    }

    public static Set<String> difference(Set<String> setOne, Set<String> setTwo) {
        Set<String> diffSet = new HashSet<>(setOne);

        diffSet.removeAll(setTwo);

        return diffSet;
    }
}
