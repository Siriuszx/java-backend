package homework_37;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MySimpleArrayList {
    private LocalDate[] array;

    public MySimpleArrayList() {
        array = new LocalDate[0];
    }

    public MySimpleArrayList(int sizeDefault) {
        array = new LocalDate[sizeDefault];
    }

    public void add(LocalDate value) {
        LocalDate[] temp = new LocalDate[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[temp.length - 1] = value;

        array = temp;
    }

    public int size() {
        return array.length;
    }


    public int indexOf(LocalDate value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }

        return -1;
    }

    public boolean contains(LocalDate value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return true;
        }

        return false;
    }

    public boolean remove(LocalDate value) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                array[i] = null;
            }
        }

        if (index != -1) {
            LocalDate[] temp = new LocalDate[array.length - 1];
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) temp[counter++] = array[i];
            }

            array = temp;
            return true;
        }

        return false;
    }

    public LocalDate remove(int index) {
        LocalDate removedItem;

        if (index >= 0 && index <= array.length - 1) {
            removedItem = array[index];
            array[index] = null;

            LocalDate[] temp = new LocalDate[array.length - 1];
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) temp[counter++] = array[i];
            }

            array = temp;
            return removedItem;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public LocalDate get(int index) {
        if (index >= 0 && index <= array.length - 1)
            return array[index];
        else
            return null;
    }

    public long dayDifference() {
        LocalDate earliest = array[0];
        LocalDate latest = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(earliest) < 0)
                earliest = array[i];
            if(array[i].compareTo(latest) > 0)
                latest = array[i];
        }

        return ChronoUnit.DAYS.between(earliest, latest);
    }
}

