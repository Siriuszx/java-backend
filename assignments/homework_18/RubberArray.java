package homework_18;

public class RubberArray {
    int[] mainArray;
    int size;
    int cursorIndex;

    RubberArray() {
        mainArray = new int[0];
        size = 0;
    }

    RubberArray(int size) {
        mainArray = new int[size];
        this.size = size;
    }

    RubberArray(int[] items) {
        mainArray = items;
        size = items.length;
    }

    void push(int item) {
        int[] temp = new int[size + 1];

        for (int i = 0; i < mainArray.length; i++) {
            temp[i] = mainArray[i];
        }

        temp[temp.length - 1] = item;

        size = temp.length;
        mainArray = temp;
    }

    void printAllItems() {
        for (int i = 0; i < mainArray.length; i++) {
            System.out.println(mainArray[i]);
        }
    }

    int indexOf(int item) {
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] == item) return i;
        }

        return -1;
    }

    int getItem(int index) {
        return (index < mainArray.length && index >= 0) ? mainArray[index] : -1;
    }

    int length() {
        return mainArray.length;
    }

    void remove(int index) {
        int[] temp = new int[size - 1];

        for (int i = 0; i < mainArray.length - 1; ) {
            if (!(i == index)) {
                temp[i] = mainArray[i];
                i++;
            }
        }

        size = temp.length;
        mainArray = temp;
    }

    void removeByValue(int value) {
        int[] temp = new int[size - 1];
        int counter = 0;

        for (int i = 0; i < mainArray.length; i++) {
            if (!(mainArray[i] == value)) {
                temp[counter] = mainArray[i];
                counter++;
            }
        }

        size = temp.length;
        mainArray = temp;
    }

    void splice(int... items) {
        int[] temp = new int[size + items.length];

        for (int i = 0; i < mainArray.length; i++) {
            temp[i] = mainArray[i];
        }

        for (int i = 0; i < items.length; i++) {
            temp[i + mainArray.length] = items[i];
        }

        size = temp.length;
        mainArray = temp;
    }

    void replaceByIndex(int index, int value) {
        mainArray[index] = value;
    }

    void replaceByValue(int oldValue, int newValue) {
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] == oldValue) {
                mainArray[i] = newValue;
                break;
            }
        }
    }
}
