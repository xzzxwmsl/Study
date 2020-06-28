package chapter_9;

// 可见性修饰符
public class Nine_4_1 {
    public static void main(String[] args) {
        Test test = new Test(2, 36);
        // System.out.println(test.a); 不在一个类里，不可以调用
        System.out.println(test.b);// 虽然是默认类型，但是是包私有，所以可以使用
    }
}

class Test {
    private int a;
    int b;

    Test() {
        a = 1;
        b = 1;
    }

    Test(int _a, int _b) {
        a = _a;
        b = _b;
    }

    private int getA() {
        return a;
    }
}