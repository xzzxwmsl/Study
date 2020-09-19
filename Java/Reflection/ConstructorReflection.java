package reflection;

import java.lang.reflect.Constructor;

public class ConstructorReflection {
    // 通过Class创建实例
    public static void main(String[] args) throws Exception {
        Student student = new Student("xzz", 100);
        System.out.println(student);

        Class studentCls = Student.class;
        Constructor stuCons = studentCls.getDeclaredConstructor(String.class, int.class); // not a public Method
        Student student2 = (Student) stuCons.newInstance("构建类", 100);
        System.out.println(student2);

        Constructor stuCons2 = studentCls.getConstructor(String.class);
        Object student3 = stuCons2.newInstance("中国");
        System.out.println(student3);
        // System.out.println((Student)student3.getCountry());// 错误强制转义法
        System.out.println(((Student)student3).getCountry());
    }

}
