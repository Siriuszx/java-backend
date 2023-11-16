package homework_51;

import java.io.*;

public class classroom {

    public static void main(String[] args) {
        String defPath = "./src/homework_51/testDir/";

        init(defPath);
        System.out.println("Path to \"Java7\": " + getPath(defPath, "Java7"));
    }

    public static String getPath(String defPath, String query) {
        File dir = new File(defPath);

        File[] fileList = dir.listFiles();

        assert fileList != null;

        for (File file : fileList) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                if (br.readLine().equals(query))
                    return file.getPath();

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "";
    }

    public static void init(String defPath) {
        File newDir = new File(defPath);
        newDir.mkdirs();

        for (int i = 1; i <= 10; i++) {
            File temp = new File(String.format("%stest_%d.txt", defPath, i));

            try {
                temp.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                FileWriter fw = new FileWriter(temp);
                fw.write(String.format("Java%d", i));
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
