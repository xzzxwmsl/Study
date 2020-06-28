package chapter_9;
// test for private and package-private
public class Nine_4_2 {
    public static void main(String[] args) {
        Test test = new Test(2, 36);
        // System.out.println(test.a); 不在一个类里，不可以调用
        System.out.println(test.b);// 虽然是默认类型，但是是包私有，所以可以使用
    }
}