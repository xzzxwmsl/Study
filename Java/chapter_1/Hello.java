package chapter_1;
public class Hello { 
    // 主类名与文件名相同，且以大写字母开头
    public static void main(String[] args) { // 主方法
        System.out.println("Hello World !");
        int x=num();
        System.out.println(x);
    }

    public static int num(){
        return 100;
    }
}