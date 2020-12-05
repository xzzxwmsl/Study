package code.basic;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedBag<T> implements Iterable<T> {
    private Node first;
    private int N;

    private class Node {
        Node(T val){
            this.val = val;
            next = null;
        }
        T val;
        Node next;
    }

    LinkedBag(){
        first = null;
        N = 0;
    }

    public void add(T item){
        // 头插法
        Node oldFirst = first;
        first = new Node(item);
        first.next = oldFirst;
        N++;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node p = first;
        @Override
        public boolean hasNext() {
            return p != null;
        }

        @Override
        public T next() {
            T val = p.val;
            p = p.next;
            return val;
        }

    }

}
