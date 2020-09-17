package reflection;

public class Reflection {
    public static void main(String[] args) {
        Object n1 = Integer.valueOf("12");
        Number n2 = Double.valueOf(12.2);
        // String s1 =Integer.valueOf(1); // error: 没有继承关系，不能直接赋值
        Class a, b, c;
        a = String.class;
        // b=Class.forName("Java.lang.Class");
        String s = "x";
        c = s.getClass();

        System.out.println(a == c);

        // ***instance of*** 和 ***Class***的区别
        Integer testIntegetOne = Integer.valueOf(1);
        boolean b1, b2, b3, b4;
        b1 = testIntegetOne instanceof Integer;
        b2 = testIntegetOne instanceof Number;
        b3 = (testIntegetOne.getClass() == Integer.class);
        // b4 = (testIntegetOne.getClass() == Number.class); //false
        System.out.printf("b1:%b, b2:%b, b3:%b", b1, b2, b3);
        System.out.println("---------------");
        showInfo(String.class);
        System.out.println("---------------");
        showInfo(Number.class);
        System.out.println("---------------");
        showInfo(Runnable.class);
        System.out.println("---------------");
        showInfo(String[].class);
        System.out.println("---------------");
        showInfo(int.class);

    }  

    static void showInfo(Class cls) {
        System.out.println("Name : "+cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }
}

