package battleship;

import java.util.Scanner;

public class battleship {
    public static void main(String[] args) {
        gameController();
    }

    public static void gameController() {
        Scanner scanner = new Scanner(System.in);

        String[][] battleField = new String[5][5];

        boolean isGame = true;


        initializeField(battleField);
        setRndTarget(battleField);
        updateField(battleField);

        System.out.println("All set. Get ready to rumble!");

        while (isGame) {
            System.out.println("Make a move");

            System.out.println("Enter position X: ");
            int ansX = scanner.nextInt();

            System.out.println("Enter position Y: ");
            int ansY = scanner.nextInt();

            if (checkConstraints(ansX, ansY)) {
                clearConsole();
                makeMove(battleField, ansX, ansY);
                updateField(battleField);
            } else {
                System.err.println("Error: wrong coordinates.");
            }

            if(checkWinCondition(battleField)) {
                isGame = false;
                System.out.println("You have won! Game over.");
            }
        }
    }

    public static void makeMove(String[][] field, int posX, int posY) {
        int posXArr = posX - 1;
        int posYArr = posY - 1;

        if (field[posYArr][posXArr] == "S")
            field[posYArr][posXArr] = "X";
        if (field[posYArr][posXArr] == "*")
            field[posYArr][posXArr] = "*";
        if (field[posYArr][posXArr] == "-")
            field[posYArr][posXArr] = "*";
    }

    public static void setRndTarget(String[][] field) {
        int rndPosX = (int) (Math.random() * 5);
        int rndPosY = (int) (Math.random() * 5);

        field[rndPosY][rndPosX] = "S";

        System.out.printf("%d %d\n", rndPosX + 1, rndPosY + 1); // Debugging
    }

    public static void updateField(String[][] field) {
        String temp = "";

        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field[1].length; j++) {
                if (field[i][j] == "*") temp += " * ";
                if (field[i][j] == "-") temp += " - ";
                if (field[i][j] == "S") temp += " - ";
                if (field[i][j] == "X") {
                    temp += " X ";
                }
            }
            System.out.println(temp);
            temp = "";
        }
    }

    public static void initializeField(String[][] field) {
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field[1].length; j++) {
                field[i][j] = "-";
            }
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static boolean checkWinCondition(String[][] field) {
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field[1].length; j++) {
                if (field[i][j] == "S") return false;
            }
        }

        return true;
    }

    public static boolean checkConstraints(int posX, int posY) {
        if ((posX >= 1) && (posX <= 5) && (posY >= 1) && (posY <= 5)) {
            return true;
        } else {
            return false;
        }
    }
}
