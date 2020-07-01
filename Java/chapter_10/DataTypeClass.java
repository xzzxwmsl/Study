package chapter_10;

import java.math.BigDecimal;
import java.math.BigInteger;

// 介绍基本数据类型的类,BigInteger, BigDecimal
public class DataTypeClass {
    public static void main(String[] args) {
        // 包装类没有无参构造方法。所有包装类的实例都是不可变的
        // 这意味着一旦创建对象后，它们的内部值就不能再改变
        Integer integer = new Integer("30"); // 可以将String类型转化为整数型
        System.out.println(integer);
        System.out.println(integer.intValue() + 10);
        System.out.println(integer.compareTo(10));
        System.out.println(Integer.MAX_VALUE + " " + integer.MAX_VALUE);
        String s = "20";
        int x = 10;
        System.out.println(x + Integer.parseInt(s));// 使用Integer的静态方法
        System.out.println("2进制转化为10进制: " + Integer.parseInt("11", 2));
        System.out.println("16进制转化为10进制: " + Integer.parseInt("FF", 16));
        System.out.println("13进制转化为10进制: " + Integer.parseInt("1A", 13));

        System.out.println(String.format("%x", 255));// 十进制转化为16进制

        // 开箱装箱
        Integer[] intArray1 = { 1, 2, 3, 6, 2 };// 基本类型值被装箱为对象new Integer(1)... 等
        for (int i = 0; i < 5; i++) {
            System.out.print(intArray1[i] + " ");// 对象被自动转化为类型值
        }
        System.out.println();

        // Biglnteger 类和 BigDecimal 类可以用于表示任意大小和精度的整教或者十进制數。
        BigDecimal a = new BigDecimal(1.0);
        BigDecimal b = new BigDecimal(3);
        BigDecimal c = a.divide(b, 2, BigDecimal.ROUND_UP);
        System.out.println(c);

        System.out.println("5! = "+factorial(5));
        System.out.println("100! = "+factorial(100));
    }

    public static BigInteger factorial(int n) {
        BigInteger result = new BigInteger(1 + "");
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}