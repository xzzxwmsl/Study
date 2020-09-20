package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

// 详细解释动态代理的意义
public class DynamicProxy2 {

    public static void main(String[] args) throws Exception {
        Staff ordinaryStaff = new Staff();
        ordinaryStaff.eat();
        ordinaryStaff.run();

        // 现在有一位特殊的员工，他是经理，我们自然要对他额外照顾，要给他加一下功能。
        // 一种思路是定义一个类：经理类，他继承自员工类，但世上经理千千万，有A部门的儿子，也有B部门的儿子，更有C部门的儿子，不能把他们挨个定义出来，
        // 现在就可以使用动态代理机制，动态的给经理加上功能，以后碰到其他经理也同样处理。

        // InvocationHandler作用就是，当代理对象的原本方法被调用的时候，会重定向到一个方法，
        // 这个方法就是InvocationHandler里面定义的内容，同时会替代原本方法的结果返回。
        // InvocationHandler接收三个参数：proxy，代理后的实例对象。 method，对象被调用方法。args，调用时的参数。

        InvocationHandler handler = (proxy, method, handlerArgs) -> {
            if (method.getName().equals("eat")) {
                System.out.println("我可以吃香喝辣");
            } else if (method.getName().equals("write")) {
                System.out.println("我的题目是升职");
                // 调用普通职工类的write方法，流程还是要走的，还是要交一篇报告上去，不能太明目张胆。
                method.invoke(ordinaryStaff, handlerArgs);
                System.out.println("升值成功");
            }
            return null;
        };

        // 对这个实例对象代理生成一个代理对象。
        // 被代理后生成的对象，是通过Factory接口的字节码增强方式创建的类而构造出来的。它是一个临时构造的实现类的对象。
        // loder和interfaces基本就是决定了这个类到底是个怎么样的类。而h是InvocationHandler，决定了这个代理类到底是多了什么功能.
        // 通过这些接口和类加载器，拿到这个代理类class。然后通过反射的技术复制拿到代理类的构造函数，
        // 最后通过这个构造函数new个一对象出来，同时用InvocationHandler绑定这个对象。
        // 最终实现可以在运行的时候才切入改变类的方法，而不需要预先定义它。

        Factory manager = (Factory) Proxy.newProxyInstance(Staff.class.getClassLoader(), Staff.class.getInterfaces(), handler);
        manager.eat();
        manager.write();
    }

}

interface Factory {
    void eat();

    void run();

    void write();
}

class Staff implements Factory {
    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void write() {
        System.out.println("write");
    }
}