package chapter_2;

import java.util.*;

public class Scanner_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 整 行 的 Scanner input = new Scanner(System in)
        // 表明创建了一个 Scanner 对象，并且将它的引用值陚值给变量 input。
        double radius;
        System.out.println("Please input the radius: ");
        radius = input.nextDouble();
        final double PI = 3.1415926;
        double area = radius * radius * PI;
        System.out.println("The area of circle is: " + area);

        // 幂运算
        System.out.println(Math.pow(2, 3));

        // 科学计数法
        System.out.println(1.32E3);

        // 下划线提高可读性
        long longNum = 111_111_111L;
        System.out.println("longNum is: " + longNum);

        // 获取当前时间,从1970-1-1-0：0到现在的毫秒数
        long timeSeed = System.currentTimeMillis();
        long timeSecond = timeSeed / 1000;
        long nowSecond = timeSecond % 60;
        long timeMinu = timeSecond / 60;
        long nowMinus = timeMinu % 60;
        long timeHours = timeMinu / 60;
        long nowHour = timeHours % 24;
        System.out.println("Now time is: " + nowHour + "-" + nowMinus + "-" + nowSecond);

        // 增强陚值操作符在表达式中所有其他操作符计算完成后执行。
        int i = 10;
        i *= 1 + 2;
        System.out.println("i is :" + i);

        // 3*4.5 = > 3.0 * 4.5
        System.out.println("1/2 is: " + 1 / 2 + " and (double)1/2 is :" + (double) 1 / 2);

        //Java 中，xl op= x2 形式的增强賦值表达式，执行为 xl = (T)(xl op x2), 这里 T 是 xl 的类型
        int j=10;
        j+=4.5;
        System.out.println(j); // not is 14.5
    }
}