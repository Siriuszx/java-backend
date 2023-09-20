package homework_11;

public class homework_11 {
    public static void main(String[] args) {

        // Task 0 Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
        int[] nums = new int[]{1, 33, 21, 510, 100};

        int minValue = nums[0];

        int maxValue = nums[0];

        int accu = 0;
        int avgValue = 0;

        // Min
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) minValue = nums[i];
        }

        System.out.printf("Min value: '%d'\n", minValue);

        // Max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) maxValue = nums[i];
        }

        System.out.printf("Max value: '%d'\n", maxValue);

        // Avg
        for (int i = 0; i < nums.length; i++) {
            accu += nums[i];
        }

        avgValue = accu / nums.length;

        System.out.printf("Avg value: '%d'\n", avgValue);

        // Task 1 Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
        int[] newNums = new int[]{5, 6, -25, 0, 31, -15};

        int temp = 0;

        int biggestIndex = 0;
        int smallestIndex = 0;

        for (int i = 0; i < newNums.length; i++) {
            if (newNums[biggestIndex] < newNums[i]) biggestIndex = i;
            if (newNums[smallestIndex] > newNums[i]) smallestIndex = i;
        }

        System.out.printf("Biggest number index: %s\n", biggestIndex);
        System.out.printf("Smallest number index: %s\n", smallestIndex);

        temp = newNums[biggestIndex];
        newNums[biggestIndex] = newNums[smallestIndex];
        newNums[smallestIndex] = temp;

        for (int i = 0; i < newNums.length; i++) {
            System.out.println(newNums[i]);
        }

        // Task 2 Дан массив строк. Вывести на экран все символы из самой длинной строки массива
        String[] wordArr = new String[]{"One", "Two", "Twenty"};
        int longestIndex = 0;

        for (int i = 0; i < wordArr.length; i++) {
            if(wordArr[longestIndex].length() <= wordArr[i].length()) longestIndex = i;
        }

        for (int i = 0; i < wordArr[longestIndex].length(); i++) {
            System.out.println(wordArr[longestIndex].toCharArray()[i]);
        }
    }
}
