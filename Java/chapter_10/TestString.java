package chapter_10;

// 学习String类
// 对象内存空间，split，replace， match正则表达式
public class TestString {
    public static void main(String[] args) {
        // create a String object
        String msg1 = "Welcome to Java";
        String msg2 = new String("Welcome to Java");
        char[] msg_3 = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
        String msg3 = new String(msg_3);
        System.out.println(msg1 + "\t" + msg2 + '\t' + msg3);

        // !不可变字符串与限定字符串
        String str1 = "Welcome to Java!";
        String str2 = new String("Welcome to Java!");
        String str3 = "Welcome to Java!";
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str1 == str3 : " + str1 == str3);
        // false ==> 变成了 "str1 == str3 : Java!" == "Java!"
        System.out.println("str1 equals str2 : " + str1.equals(str2));

        System.out.println(str1.replace('a', 'A') + "---" + str1);
        System.out.println(str1.replaceAll("to", "TO"));
        String[] token = "a #b #c #d #e #f #g".split(" #");
        for (String string : token) {
            System.out.print(string + '\t');
        }
        System.out.println();
        // 正则表达式 regular expression
        String regex1 = "\\d{3}-\\d{2}-\\d{4}";
        System.out.println("131-22-1112".matches(regex1));
        System.out.println("23-123-1231".matches(regex1));
        // \\d{n}表示匹配n个数字

        // 与split， replace等综合使用
        System.out.println("A+B*C!D".replaceAll("[+*!#$@#]", "&&"));
        String[] token2 = "a #b !c @d $e %f *g".split(" #");
        for (String string : token2) {
            System.out.print(string + '\t');
        }
        System.out.println();

        String[] token3 = "a #b !c @d $e %f *g".split("[!@#$%^&*()]");
        for (String string : token3) {
            System.out.print(string + '\t');
        }
        System.out.println();

        // char[] <== String
        char[] ss1 = "abcde".toCharArray();
        for (char c : ss1) {
            System.out.print(c + " ");
        }
        System.out.println();
        // 将String从a ~ b-1的子串复制到destination数组中
        "ABCDEFG".getChars(2, 5, ss1, 1);
        for (char c : ss1) {
            System.out.print(c + " ");
        }
        System.out.println();

        // char[] ==> String
        String ss_1 = new String(ss1);
        String ss_2 = String.valueOf(ss1);
        System.out.println(ss_1 + "--" + ss_2);

        // 格式化
        String formatString = String.format("%x and %7.2f %7.2f %-4s", 255, 3.2123, 3.2, "AB");
        System.out.println(formatString);
    }
}