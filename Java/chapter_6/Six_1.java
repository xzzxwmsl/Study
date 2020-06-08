package chapter_6;

import java.util.Random;

public class Six_1 {
    public static void main(String[] args) {
        System.out.println(sumFunc(0, 100));
        System.out.println(sumFunc(100));
        System.out.println(max(1, 10));
        System.out.println(max(10, 1));

        for (int i = 0; i < 20; i++) {
            System.out.print(randomChar() + " ");
        }

        System.out.println("");

        for (int i = 0; i < 20; i++) {
            System.out.print(randomChar('a','c') + " ");
        }
    }

    public static int sumFunc(int i1, int i2) {
        int temp = 0;
        for (int i = i1; i <= i2; i++)
            temp += i;
        return temp;
    }

    // Override
    public static int sumFunc(int i1) {
        int temp = 0;
        for (int i = 0; i <= i1; i++) {
            temp += i;
        }
        return temp;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // 随机产生大小写字符串
    public static char randomChar() {
        return Math.random() * 2 > 1 ? (char) ('a' + Math.random() * ('z' - 'a' + 1))
                : (char) ('A' + Math.random() * ('Z' - 'A' + 1));
    }

    // 重载，产生在ch1 ~ ch2 之间的随机字符
    public static char randomChar(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
}
