package homework_34;

import java.util.Iterator;
import java.util.ListIterator;

public class MyIterableArrayList<T> implements MyList<T>, Iterable<T> {
    private T[] array;

    public MyIterableArrayList() {
        array = (T[]) new Object[0];
    }

    public MyIterableArrayList(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    @Override
    public void add(T value) {
        T[] temp = (T[]) new Object[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[temp.length - 1] = value;

        array = temp;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }

        return -1;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return true;
        }

        return false;
    }

    @Override
    public boolean remove(T value) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                array[i] = null;
            }
        }

        if (index != -1) {
            T[] temp = (T[]) new Object[array.length - 1];
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) temp[counter++] = array[i];
            }

            array = temp;
            return true;
        }

        return false;
    }

    @Override
    public T remove(int index) {
        T removedItem;

        if (index >= 0 && index <= array.length - 1) {
            removedItem = array[index];
            array[index] = null;

            T[] temp = (T[]) new Object();
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

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index <= array.length - 1)
            return array[index];
        else
            return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int pointer = 0;

        @Override
        public boolean hasNext() {
            return pointer < array.length;
        }

        @Override
        public T next() {
            return array[pointer++];
        }
    }
}

