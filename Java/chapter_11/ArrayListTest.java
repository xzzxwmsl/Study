package chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        cities.add("Miami");
        cities.add("Seoul");
        cities.add("Tokyo");
        System.out.println("List size : " + cities.size());
        System.out.println("is Miami in the list : " + cities.contains("Miami"));
        System.out.println("The location of Denver in the list : " + cities.indexOf("Denver"));
        System.out.println("Is empty : " + cities.isEmpty());
        System.out.println("location 0 is : " + cities.get(0));
        cities.add(2, "Xian");
        // Contains [London, Denver, Xian, Paris, Miami , Seoulf Tokyo]
        cities.remove(1);
        // Contains [London, Xian, Paris, Seoulf Tokyo]
        System.out.println(cities.toString());
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + "\t");
        }
        System.out.println();

        // String [] => ArrayList
        String[] array1 = { "Aa", "Bb", "Cc" };
        ArrayList<String> arrayList_1 = new ArrayList<>(Arrays.asList(array1));

        // for (int i = 0; i < arrayList_1.size(); i++) {
        // System.out.print(arrayList_1.get(i) + "\t");
        // }
        System.out.println(arrayList_1);

        // ArrayList => String[]
        String[] array2 = new String[arrayList_1.size()];
        arrayList_1.toArray(array2);
        for (String i : array2) {
            System.out.print(i + "\t");
        }
        // 如果列表中的元素是可比较的，比如整数、双精度浮点数或者字符串，则可以使用
        // java.util .Collections 类中的静态的 sort 方法来对元素进行排序。

        System.out.println("------------------");
        Integer[] intArray = { 1, 12, 3, 213, 12, 3, 21, 3, 124, 21, 3 };
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(intArray));

        // int[] intArray = { 1, 12, 3, 213, 12, 3, 21, 3, 124, 21, 3 };
        // 错误，此处不可以使用int，应该使用Integer
        // ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(intArray));
        java.util.Collections.sort(intArrayList);
        System.out.println(intArrayList);

        java.util.Collections.shuffle(intArrayList);
        System.out.println(intArrayList);

        System.out.println(java.util.Collections.max(intArrayList));
        System.out.println(java.util.Collections.min(intArrayList));

        // 举例
        String[] s = { "asdas", "asdas", "asdasd", "sadw" };
        MyStack myStack = new MyStack();
        for (int i = 0; i < s.length; i++) {
            myStack.push(s[i]);
        }
        int[] intArray2 = { 12, 3, 12, 312 };
        for (int i : intArray2) {
            myStack.push(i);
        }
        System.out.println(myStack);
        
        while(!myStack.isEmpty()){
            System.out.print(myStack.pop()+"\t");
        }
    }
}

// 可以存储对象的栈
class MyStack {
    private ArrayList<Object> stack;

    MyStack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Object top() {
        return stack.get(stack.size() - 1);
    }

    public Object pop() {
        Object re = top();
        stack.remove(stack.size() - 1);
        return re;
    }

    public void push(Object in) {
        stack.add(in);
    }

    public int getSize() {
        return stack.size();
    }

    @Override
    public String toString() {
        return "Stack : " + stack.toString();
    }
}