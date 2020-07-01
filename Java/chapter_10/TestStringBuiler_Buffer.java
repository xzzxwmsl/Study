package chapter_10;

public class TestStringBuiler_Buffer {
    public static void main(String[] args) {
        // 除了 StringBuffer 中修改缓冲区的方法是同步的，这意味着只有一个任务被允许执
        // 行方法之外，StringBuilder 类与 StringBuffer 类是很相似的。如果是多任务并发访问，
        // 就使用 StringBuffer, 因为这种情况下需要同步以防止 StringBuffer 崩溃。并发编程将
        // 在第 30章介绍。而如果是单任务访问，使用 StringBuilder 会更有效。
        StringBuilder stringBuilder = new StringBuilder("Welcome");
        stringBuilder.append(" ");
        stringBuilder.append("to ");
        stringBuilder.append("Java");
        stringBuilder.append("!");
        System.out.println(stringBuilder);
        stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder.delete(10, 19));
        System.out.println(stringBuilder.deleteCharAt(1));
        stringBuilder.setCharAt(0, 'H');
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.replace(0, 6, "Welcome"));

        String s = stringBuilder.toString();
        String ss = "Welcome to Java!";
        String sss = "Welcome to Java!";// Builder的字符串不会进行共享限定字符串优化
        System.out.println(ss.equals(s) + "--" + (ss == s) + "--" + (ss == sss));

        System.out.println("capcity: " + stringBuilder.capacity());
        System.out.println("length: " + stringBuilder.length());

        stringBuilder.setLength(15);
        System.out.println(stringBuilder.substring(0, 10));// 返回新的StringBuilder，不改变原先的
        

    }
}