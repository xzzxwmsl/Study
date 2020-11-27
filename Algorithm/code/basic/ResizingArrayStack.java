package code.basic;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] array;
    private int N = 0; // numbers of items

    ResizingArrayStack() {
        array = (Item[]) new Object[1];
    }

    ResizingArrayStack(int size) {
        array = (Item[]) new Object[size];
    }

    private void resize(int v) {
        Item[] temp = (Item[]) new Object[v];
        for (int i = 0; i < N; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void push(Item v) {
        if (N == array.length - 1)
            resize(array.length * 2);
        array[N++] = v;
    }

    public Item pop() throws IllegalArgumentException {
        if (N <= 0)
            throw new IllegalArgumentException("Stack out!");
        Item result = array[--N];
        array[N] = null;
        if (N > 0 && N == array.length / 4)
            resize(array.length / 2);
        return result;
    }

    public Item top() throws IllegalArgumentException {
        if (N <= 0)
            throw new IllegalArgumentException("Stack out!");
        return array[N - 1];
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int index = N;

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public Item next() {
            return array[--index];
        }

    }

}
