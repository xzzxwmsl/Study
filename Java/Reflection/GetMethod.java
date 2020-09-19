package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.*;

public class GetMethod {
    public static void main(String[] args) throws Exception {
        Class studentCls = Student.class;
        // getMoney的参数
        System.out.println(studentCls.getMethod("getMoney", String.class));
        // 无需参数(参照原方法的参数列表)
        System.out.println(studentCls.getMethod("getName"));
        // 获取private方法
        System.out.println(studentCls.getDeclaredMethod("getClassroom"));

        System.out.println("----------------");

        Method[] stuMethods = studentCls.getMethods();
        for (Method method : stuMethods) {
            System.out.println(method);
        }

        System.out.println("-----------------");

        // 调用方法
        String s = "Hello. This is a test of call of Method";
        Method sMethod = s.getClass().getMethod("substring", int.class, int.class);
        String sSub = (String) sMethod.invoke(s, 0, 6); // 必须要转义
        System.out.println(sSub);

        Student student = new Student("a");
        System.out.println("------getName-------");
        System.out.println(student.getName());
        Field studentNameField = studentCls.getField("name"); // 父类的public字段
        studentNameField.set(student, "xzz"); // 设置字段值
        System.out.println(studentCls.getMethod("getName").invoke(student));

        // 调用静态方法

        Method strParseInt = Integer.class.getMethod("parseInt", String.class);
        Integer integer = (Integer) strParseInt.invoke(null, "132");
        System.out.println(integer);

        // 调用private方法

        Method privateMethod = Student.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // 设置私有方法为可访问
        System.out.println(privateMethod.invoke(student));

        
    }
}
