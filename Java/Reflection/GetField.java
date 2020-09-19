package reflection;
import java.lang.reflect.Field;

public class GetField {
    public static void main(String[] args) throws Exception {
        People people = new People("a");
        Student student = new Student("a");
        Class stuCls = student.getClass();
        System.out.println(stuCls.getField("name"));
        // System.out.println(stuCls.getField("age")); //不是public
        // System.out.println(stuCls.getField("sex")); // not public
        // System.out.println(stuCls.getDeclaredField("name")); // 是父类的
        // System.out.println(stuCls.getField("grade")); // not public
        System.out.println(stuCls.getDeclaredField("grade"));
        System.out.println(stuCls.getDeclaredField("money"));
        System.out.println(stuCls.getDeclaredField("next").getType() == String.class);

        System.out.println("----------------");

        Field strField = String.class.getDeclaredField("value");
        System.out.println(strField.getName());
        System.out.println(strField.getType());
        int m = strField.getModifiers();

        System.out.println("-------通过反射获取字段值---------");
        People people2 = new People("China");
        Class peoCls = people2.getClass();

        Field stuCountry=peoCls.getDeclaredField("country");
        // 因为country是pri v ate，所以可以先设置其可访问性
        stuCountry.setAccessible(true);
        // 通过Class的Field获取特定实例的字段值
        Object valueCountry = stuCountry.get(people2);
        System.out.println(valueCountry);

        System.out.println("--------修改值--------");
        stuCountry.set(people2, "中国");
        System.out.println(stuCountry.get(people2));
    }
}

