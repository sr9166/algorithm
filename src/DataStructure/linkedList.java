package DataStructure;

class Node<E> {
    Node<E> prev;
    Node next;
    E data;

    Node(Node<E> prev, Node<E> next, E data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}

public class linkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    linkedList() {
        head = new Node<>(null, tail, null);
        tail = new Node<>(head, null, null);
        size = 0;
    }

    public void addLast(E data) {
        Node node = new Node<E>(tail.prev, tail, data);
        tail.prev = node;
        node.prev.next = node;
        size++;
    }

    public void addFirst(E data) {
        Node node = new Node<E>(head, head.next, data);
        head.next = node;
        node.next.prev = node;
        size++;
    }

    public void remove(int idx) {
        if(!isInRange(idx)) throw new IndexOutOfBoundsException("Index: " + idx);

        Node<E> node = head;
        for (int i = 0; i <= idx; i++) {
            node = node.next;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public int indexOf(Object obj) {
        Node<E> node = head;
        int idx = -1;
        int cnt = 0;
        while(node.next != tail) {
            node = node.next;
            if(node.data.equals(obj)) {
                idx = cnt;
                break;
            };
            cnt++;
        }

        return idx;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node node = head;
        while(node.next != tail.prev) {
            node = node.next;
            sb.append(node.data).append("->");
        }
        node = node.next;
        sb.append(node.data);

        return sb.toString();
    }

    public E getFirst() {
        return (E) head.next.data;
    }

    public E getLast() {
        return (E) tail.prev.data;
    }

    public E get(int idx) {
        if(!isInRange(idx)) throw new IndexOutOfBoundsException("Index: " + idx);

        Node<E> node = head;
        for (int i = 0; i <= idx; i++) {
            node = node.next;
        }

        return node.data;
    }

    private boolean isInRange(int idx) {
        return idx >= 0 && idx < size;
    }
}
