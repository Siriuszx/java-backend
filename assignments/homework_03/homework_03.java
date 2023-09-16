package homework_03;

public class homework_03 {
    public static void main(String[] args) {
        // Task 1
        int zero = 0;
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;

        int sum =
                zero +
                        one +
                        two +
                        three +
                        four +
                        five +
                        six +
                        seven +
                        eight +
                        nine;

        int ans = sum % 10;
        System.out.println(ans);

        // Task 2
        int itemAPrice = 1000;
        int itemBPrice = 500;

        float discountMultiplier = 0.1f;

        System.out.println("Total: " + ((itemAPrice + itemBPrice) - (itemAPrice + itemBPrice) * discountMultiplier) + "€");
        System.out.println("Discount: " + (itemAPrice + itemBPrice) * discountMultiplier + "€");

        // Task 3
        float monTemp = 29.0f;
        float tueTemp = 30.0f;
        float wedTemp = 24.0f;
        float thuTemp = 21.0f;
        float friTemp = 22.0f;
        float satTemp = 25.0f;
        float sunTemp = 26.0f;

        float weekAvgTemp = (
                monTemp +
                        tueTemp +
                        wedTemp +
                        thuTemp +
                        friTemp +
                        satTemp +
                        sunTemp) / 7;

        System.out.println("Average temperature this week: " + weekAvgTemp);

        // Task 4
        int exampleOne = 27;
        int exampleTwo = 13;
        int exampleThree = 125;
        int exampleFour = 99;

        System.out.println("Ex1: " + exampleOne % 2);
        System.out.println("Ex2: " + exampleTwo % 2);

        System.out.println("Ex3: " + exampleThree % 3);
        System.out.println("Ex4: " + exampleFour % 3);

        // Task 5(*)
        int x = 3;
        x += x++; // returns 'x' first and only then increments its value by 1

        System.out.println("Ans: " + x); // Ans: "6"
    }
}
