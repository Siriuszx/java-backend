package homework_34;

public interface MyList<T> {
    void add(T value);

    int size();

    int indexOf(T value);

    boolean contains(T value);

    boolean remove(T value);

    T remove(int index);

    boolean isEmpty();

    T get(int index);
}
