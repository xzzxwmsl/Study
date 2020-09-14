# 反射(Reflection)
## What is Reflection
除了int等基本的数据类型外，java的其他基本类型都是class(包括interface)  
如:**String,Object,Runnable,Exception**  
```Java
        Object n1 = Integer.valueOf("12");
        Number n2 = Double.valueOf(12.2);
        String s1 =Integer.valueOf(1); // error: 没有继承关系，不能直接赋值
```
并且class是JVM在执行过程中动态加载的，JVM在第一次读取到这个class时，将其加载到内存中去；并且每加载一种class，JVM就将为其创建一个***Class***实例(Note:Class是名为Class的class)，他的声明如下：
```Java
public final class Class{  
   private Class(){};  
}
```
比如在加载String类时，他首先读取 **Sring.class** 到内存中去，然后为String类创建一个Class的class并关联起来
```Java
Class cls = new Class(String);
```
这个Class的实例是由JVM创建的，查看JDK源码，Class类的构造方法是private的，即其只能由JVM调用创建Class实例，用户并不能调用创建。  
所以JVM所持有的所有Class实例都指向一个数据类型(class or interface)  

![ClassInstance](images/ClassInstance.png)  

由于JVM为每个加载的class创建对应的Class实例，并在这个实例中保存了该class的所有信息，譬如packagename、类名、父类、实现的接口、所有方法、字段等，所以如果我们获取这个Class实例，那么我们就可以通过这个Class实例来获取到该实例对应的class的所有信息。  
这种通过Class实例获取class信息的方法叫做***反射(Reflection)***  
## 如何获取一个class的Class实例
### 1 通过一个class的静态变量class获取
```Java
Class cls = String.class
```
### 2 如果有实例的变量，那么可以通过getClass()方法获取
```Java

```