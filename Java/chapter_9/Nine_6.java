package chapter_9;

// 不可变对象和类
// 在引用隐藏数据域以及调用一个重载的构造方法的时候，this 引用是必须的
public class Nine_6 {
    public static void main(String[] args) {
        {
            int i = 1;
        }
        {
            Test3 test3 = new Test3(2);
        }
        // System.out.println(test3.getI()); 无效，因为test3的作用域仅仅在上述域中
        Test3 test3 = new Test3(2);
        System.out.println(test3.getI());
    }
}

class Test3 {
    private int i;
    private static int j=0;
    Test3(int i) {
        // i=i;
        this.i = i;
    }
    // 关键字 this 可以用于调用同一个类的另一个构造方法
    Test3(){
        this(0);// 调用Test3(int i)
    }

    public int getI() {
        return i;
    }

    public static int getJ(){
        return j;
    }

    public static void setJ(int j){
        Test3.j=j;
    }
}