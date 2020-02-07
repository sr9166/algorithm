package DataStructure;

public class arraylist<E> {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Object[] elemetData;

    public arraylist() {
        size = 0;
        elemetData = new Object[DEFAULT_SIZE];
    }

    public arraylist(int initialSize) {
        size = 0;
        elemetData = new Object[initialSize];
    }

    private void expandArray() {
        Object[] newArray = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elemetData[i];
        }
        elemetData = newArray;
    }

    private boolean checkIndex(int idx) {
        return idx >= 0 && idx < size;
    }

    private boolean isFull() {
        return size == elemetData.length;
    }

    public void add(E obj) {
        if(isFull()) expandArray();
        elemetData[size++] = obj;
    }

    public void add(int idx, E obj) {
        if(!checkIndex(idx)) throw new IndexOutOfBoundsException("Index: " + idx);

        if(isFull()) expandArray();

        for (int i = size; i > idx ; i--) {
            elemetData[i] = elemetData[i - 1];
        }

        elemetData[idx] = obj;
        size++;
    }

    public void remove(int idx) {
        if(!checkIndex(idx)) throw new IndexOutOfBoundsException("Index: " + idx);

        for (int i = idx; i < size - 1; i++) {
            elemetData[i] = elemetData[i+1];
        }
        elemetData[--size] = null;
    }

    public int indexOf(E obj) {
        for (int i = 0; i < size; i++) {
            if(elemetData[i].equals(obj)) return i;
        }

        return -1;
    }

    public void remove(E obj) {
        remove(indexOf(obj));
    }

    public E get(int idx) {
        if(!checkIndex(idx)) throw new IndexOutOfBoundsException("Index: " + idx);

        return (E) elemetData[idx];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E obj) {
        return indexOf(obj) >= 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elemetData[i]);
            if(i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
