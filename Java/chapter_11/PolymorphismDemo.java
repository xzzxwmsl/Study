package chapter_11;

// 类型参数，动态绑定
public class PolymorphismDemo {
    public static void main(String[] args) {
        SimpleGeometricObject geo = new SimpleGeometricObject();
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject();
        print(geo);
        print(circle);

        useToString(new Object());
        useToString(new PersonTest());
        useToString(new Student());
        useToString(new GraduateStudent());

        // 对象转换
        // 隐式转换,因为GraduateStudent是Object的实例
        Object graduaObject = new GraduateStudent();
        // GraduateStudent b = graduaObject; // Error，必须使用显式转换
        GraduateStudent b = (GraduateStudent) graduaObject;
        Object c = b;// 子类总是可以转化为父类，因为子类总是父类的实例
        // 但是父类不一定可以转化为子类，原因是 Student 对象总是 Object 的实例，但是，Object 对
        // 象不一定是 Student 的实例

        // 当把一个父类的实例转换为它的子类变量（称为向下转换
        // (downcasting)) 时，必须使用转换记号 “(子类名)” 进行显式转换，向编译器表明你的意图。
        // 为使转换成功，必须确保要转换的对象是子类的一个实例。如果父类对象不是子类的一个
        // 实例，就会出现一个运行异常 ClassCastException
        Object ob1=new Object();
        Object ob2=new Student();
        Student st=new Student();
        GraduateStudent gst= new GraduateStudent();
        System.out.println(ob1 instanceof Object);
        System.out.println(ob2 instanceof Object);
        System.out.println(ob2 instanceof PersonTest);
        System.out.println(ob2 instanceof Student);
        System.out.println(ob2 instanceof GraduateStudent);
        System.out.println(st instanceof Student);
        System.out.println(gst instanceof Student);
        System.out.println(ob1 instanceof Student);
    }

    // 总可以将子类型的实例传递给需要父类型的参数
    public static void print(SimpleGeometricObject simpleGeometricObject) {
        System.out.println(simpleGeometricObject.getDate() + "-" + simpleGeometricObject.getColor());
    }

    // 动态绑定
    public static void useToString(Object object) {
        System.out.println(object.toString());
    }

}

class PersonTest extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends PersonTest {
    @Override
    public String toString() {
        return "Student";
    }
}

class GraduateStudent extends Student {

}