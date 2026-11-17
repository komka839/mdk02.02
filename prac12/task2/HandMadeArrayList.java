package prac12.task2;

public class HandMadeArrayList<T> {

    private int size = 0;
    private Object[] elements = new Object[10];

    public void add(T newElement) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = newElement;
        size = size + 1;
    }

    private void grow() {
        Object[] newElements = new Object[elements.length + elements.length / 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(elements[i]);
        }
        return sb.append("]").toString();
    }
}
