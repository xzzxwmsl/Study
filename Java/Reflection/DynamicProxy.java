package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static void main(String[] args) {
        // CharSequence charSequence = new StringBuffer(); //interface可以通过向上转型并指向某个实例

        // 常见的一种调用接口的方式
        Hello hello = new HelloSomebody();
        hello.morning("xzz");

        System.out.println("-----DynamicProxy-----");

        // 并不去编写实现类，而是直接通过JDK提供的一个Proxy.newProxyInstance()
        // 创建了一个Hello接口对象。这种没有实现类但是在运行期动态创建了一个接口
        // 对象的方式，我们称为动态代码。JDK提供的动态创建接口对象的方式，就叫动态代理。

        // 定义方式 ONE
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // System.out.println(proxy.getClass());
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good Morning : " + args[0]);
                    // method.invoke(hello, args); // 调用已经定义好的方法
                } else {
                    System.out.println("待定义");
                }
                // 这里使用method.getName()获取传入的方法的名字，并按名字对其进行内容定义
                return null;
            }
        };
        /**
         * 定义方式 TWO 
         * InvocationHandler handler = (proxy, method, handlerArgs) -> {
         * System.out.println(proxy.getClass()); if (method.getName().equals("morning"))
         * { System.out.println("Good Morning: " + handlerArgs[0]); //
         * method.invoke(hello, handlerArgs); //等价上方 } else { System.out.println("待定义");
         * }
         * 
         * return null; };
         */

        // loader : 传入ClassLoader
        // interface : 传入要实现的接口
        // h : 传入处理调用方法的InvocationHandler

        Hello hello2 = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] { Hello.class },
                handler);

        hello2.morning("DynamicProxy"); // 传入handler后，在第25行检测到函数签名为morning，所以执行其相应内容
        hello2.printName("name");

        // 在运行期动态创建一个interface实例的方法如下：
        /**
         * 
         * 定义一个InvocationHandler实例，它负责实现接口的方法调用；
         * 通过Proxy.newProxyInstance()创建interface实例，它需要3个参数：
         * 使用的ClassLoader，通常就是接口类的ClassLoader； 需要实现的接口数组，至少需要传入一个接口进去；
         * 用来处理接口方法调用的InvocationHandler实例。 将返回的Object强制转型为接口。
         * 
         * 动态代理实际上是JDK在运行期动态创建class字节码并加载的过程 相当于如下代码 public class HelloDynamicProxy
         * implements Hello { InvocationHandler handler; public
         * HelloDynamicProxy(InvocationHandler handler) { this.handler = handler; }
         * public void morning(String name) { handler.invoke( this,
         * Hello.class.getMethod("morning", String.class), new Object[] { name }); } }
         */

    }
}

interface Hello {
    public void morning(String name);

    void printName(String name);
}

class HelloSomebody implements Hello {
    @Override
    public void morning(String name) {
        System.out.println("Good morning : " + name);
    }

    @Override
    public void printName(String name) {
        System.out.println(name);
    }
}
