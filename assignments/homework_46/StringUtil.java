package homework_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StringUtil {
    public static List<String> getUniqueSortedWords(String sentence) {
        List<String> wordList = new ArrayList<>(List.of(sentence.split("\\W+")));

        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j)))
                    wordList.remove(i);
            }
        }

        wordList.sort(String.CASE_INSENSITIVE_ORDER);

        return wordList;
    }
}
