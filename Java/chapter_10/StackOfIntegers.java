package chapter_10;



public class StackOfIntegers {
    private int size;
    private int[] elements;
    private static final int CAPCITY_DEFAULT = 16;

    StackOfIntegers(int capcity) {
        elements = new int[capcity];
        // size = 0;  //创建一个对象后，int 默认就是0
    }

    StackOfIntegers() {
        this(CAPCITY_DEFAULT);// default make size is 16
    }

    public int getSize() {
        return size;
    }

    public void push(int i) {
        if (size >= elements.length) { // 栈满了
            int[] tempArray = new int[elements.length * 2];// double times
            System.arraycopy(elements, 0, tempArray, 0, elements.length);
            elements = tempArray;
        }
        elements[size++] = i;
    }

    public int top() {
        return elements[size - 1];
    }

    public int pop() {
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}