package Reflection;

public class Reflection {
    public static void main(String[] args) {
        Object n1 = Integer.valueOf("12");
        Number n2 = Double.valueOf(12.2);
        // String s1 =Integer.valueOf(1); // error: 没有继承关系，不能直接赋值
    }
}
