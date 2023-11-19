package homework_51.homework_51;

import java.io.*;
import java.util.*;

public class FilterIO {
    private String defPath;

    public FilterIO(String defPath) {
        this.defPath = defPath;
    }

    public Map<String, Integer> getDepositHistory(String fileName) {
        Map<String, Integer> transactions = new HashMap<String, Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader(defPath + fileName))) {
            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                String[] data = tempLine.split(":");

                transactions.compute(data[0], (key, value) ->
                        value == null ? Integer.parseInt(data[1]) : value + Integer.parseInt(data[1])
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return transactions;
    }

    public void writeDepositHistory(Map<String, Integer> depositMap, int defValue) {
        File moreFile = new File(defPath + "more.txt");
        File lessFile = new File(defPath + "less.txt");

        try {
            moreFile.createNewFile();
            lessFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bwLess = new BufferedWriter(new FileWriter(lessFile));
             BufferedWriter bwMore = new BufferedWriter(new FileWriter(moreFile))) {

            depositMap.forEach((key, value) -> {
                if (value < defValue) {
                    try {
                        bwLess.write(String.format("%s:%d", key, value));
                        bwLess.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        bwMore.write(String.format("%s:%d", key, value));
                        bwMore.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
