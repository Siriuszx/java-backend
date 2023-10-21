package homework_30;

public class GenericRubberArray<T> {
    T[] mainArray;
    int size;
    int cursorIndex;

    GenericRubberArray() {
        mainArray = (T[]) new Object[0];
        size = 0;
    }

    GenericRubberArray(int size) {
        mainArray = (T[]) new Object[size];
        this.size = size;
    }

    GenericRubberArray(T[] items) {
        mainArray = items;
        size = items.length;
    }

    void push(T item) {
        T[] temp = (T[]) new Object[size + 1];

        for (int i = 0; i < mainArray.length; i++) {
            temp[i] = mainArray[i];
        }

        temp[temp.length - 1] = item;

        size = temp.length;
        mainArray = temp;
    }

    void printAllItems() {
        for (int i = 0; i < mainArray.length; i++) {
            System.out.println(mainArray[i].toString());
        }
    }

    int indexOf(T item) {
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] == item) return i;
        }

        return -1;
    }

    T getItem(int index) {
        return (index < mainArray.length && index >= 0) ? mainArray[index] : null;
    }

    int length() {
        return mainArray.length;
    }

    void remove(int index) {
        T[] temp = (T[]) new Object[size - 1];

        for (int i = 0; i < mainArray.length - 1; ) {
            if (!(i == index)) {
                temp[i] = mainArray[i];
                i++;
            }
        }

        size = temp.length;
        mainArray = temp;
    }

    void removeByValue(T value) {
        T[] temp = (T[]) new Object[size - 1];
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

    void splice(T... items) {
        T[] temp = (T[]) new Object[size + items.length];

        for (int i = 0; i < mainArray.length; i++) {
            temp[i] = mainArray[i];
        }

        for (int i = 0; i < items.length; i++) {
            temp[i + mainArray.length] = items[i];
        }

        size = temp.length;
        mainArray = temp;
    }

    void replaceByIndex(int index, T value) {
        mainArray[index] = value;
    }

    void replaceByValue(T oldValue, T newValue) {
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] == oldValue) {
                mainArray[i] = newValue;
                break;
            }
        }
    }
}