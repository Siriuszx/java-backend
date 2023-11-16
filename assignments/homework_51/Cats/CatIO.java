package homework_51.Cats;

import java.io.*;
import java.util.*;

public class CatIO {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("John", 9, true),
                new Cat("Pancake", 1, false),
                new Cat("Fluffers", 2, true),
                new Cat("Patootie", 4, true),
                new Cat("Boris", 10, true)
        ));

        writeCatsToFile(cats);
    }

    public static void writeCatsToFile(List<Cat> cats) {
        String defPath = "./src/homework_51/Cats/";

        File catFile = new File(defPath + "myCats.md");

        try {
            catFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(catFile);
             BufferedWriter br = new BufferedWriter(fw)) {

            cats.forEach(cat -> {
                try {
                    br.write(String.format("Name: %s\nAge: %d\nIs Male: %b\n", cat.name, cat.age, cat.isMale));
                    br.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
