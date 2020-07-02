package chapter_11;

// 重写与重载
public class OverrideTest {
    public static void main(String[] args) {
        A_1 a_1 = new A_1();
        A_2 a_2 = new A_2();
        
        a_1.p(10);
        a_1.p(10.0);

        a_2.p(10);
        a_2.p(10.0);
    }
}

class B_1 {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A_1 extends B_1 {
    @Override
    // 重写标注(注意与重载区分)
    public void p(double i) {// 方法名和参数列表都一致，是重写
        System.out.println(i);
    }
}

class B_2 {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A_2 extends B_2 {
    public void p(int i) {// 参数列表不一致，方法名一致，是重载
        System.out.println(i);
    }
}