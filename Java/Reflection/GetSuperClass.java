package reflection;

public class GetSuperClass {
    public static void main(String[] args) {
        Class intCls = Integer.class;
        Class spCls = intCls.getSuperclass();
        Class sspCls = spCls.getSuperclass();

        System.out.println(intCls);
        System.out.println(spCls);
        System.out.println(sspCls);
        System.out.println(sspCls.getSuperclass());

        System.out.println(People.class);
        System.out.println(People.class.getSuperclass());

        System.out.println("-------------");
        // 查询当前Class实现的接口
        Class[] intInterface = intCls.getInterfaces();
        for (Class class1 : intInterface) {
            System.out.println(class1);
        }
        // getInterfaces只返回当前类所直接实现的所有接口，不包含其父类实现的接口
        // 对interface的Class调用getSuperclass()则只会返回null，要得到其父接口需要调用getInterfaces()

        // 判断一个Class实例是否继承自某实例
        System.out.println(Student.class.isAssignableFrom(People.class)); // false,因为People不能赋值给Student
        System.out.println(Number.class.isAssignableFrom(Integer.class)); // true,因为Integer可以赋值给Number
    }
}
