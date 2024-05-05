package jsh.algorithm.linkedlist.mylinkedlist;

public class MyLinkedList<T> {
    transient int size = 0;
    transient MyNode<T> first;
    transient MyNode<T> last;

    public void add(T data) {
        final MyNode<T> l = last;
        final MyNode<T> newNode = new MyNode<>(l, data, null);
        last = newNode;

        if (l == null) {
            first = newNode;
        } else {
            l.next = last;
        }
        size++;
    }

    private static class MyNode<T> {

        T data;
        MyNode<T> next;
        MyNode<T> prev;

        public MyNode(MyNode<T> prev, T data, MyNode<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        MyNode<T> now = first;
        if (first == null) {
            sb.append("]");
            return sb.toString();
        }

        sb.append(now.data);

        while (now.next != null) {
            now = now.next;
            sb.append(", " + now.data);
        }
        sb.append("]");
        return sb.toString();
    }
}
