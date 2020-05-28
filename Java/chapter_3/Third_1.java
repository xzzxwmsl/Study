package chapter_3;
public class Third_1 {
    public static void main(String[] args) {
        boolean flag = true;
        // flag=0; // Type Error

        double x = 1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        final double y = 0.5;
        final double gap = 1E-14;

        if (x == y) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if (Math.abs(x - y) < gap) {
            System.out.println("euqal");
        } else {
            System.out.println("not equal");
        }

        int t = 10;
        while (t-- > 0) {
            System.out.print((int) (Math.random() * 10) + " ");
        }
        System.out.printf("\n");
        String str = "xzz";
        System.out.println(str);
        switch (str) {
            case "x":
                System.out.println("1");
                break;
            case "xzz":
                System.out.println("2");
                break;
            case "xa":
                System.out.println("3");
                break;
            default:
                System.out.println("NO");
                break;
        }

        // 三目运算符
        int I = (7 > 1) ? 2 : 1;
        System.out.println(I);

        // 优先级
        System.out.println(2 * 2 - 3 > 2 && 4 - 2 > 5);
        System.out.println(2 * 2 - 3 > 2 || 4 - 2 > 5);
    }
}