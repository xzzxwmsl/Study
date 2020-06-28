package chapter_9;

// 方法的传递基本类型值和传递对象类型参数的区别
// java只有一种参数传递方式，即***值传递***
// 基本类型是传递值，对象类型是传递的**对象引用的值**  
//（ 前面提到过 Object ob = new Object(), 的ob是引用类型 ）
public class Nine_5 {
    public static void main(String[] args) {
        int testA = 10;
        Test2 test2=new Test2(1);
        show(testA,test2);
        change(testA,test2);
        show(testA,test2);
    }

    static void show(int testA,Test2 test2){
        System.out.printf("value of testA is %d, value of test2 is %d\n", testA,test2.getA());
    }
    static void change(int testA, Test2 test2){
        testA++;
        test2.setA(test2.getA()+1);
    }
}

class Test2 {
    private int a;

    Test2(int _a) {
        a = _a;
    }

    int getA() {
        return a;
    }
    void setA(int _a){
        a=_a;
    }
}
