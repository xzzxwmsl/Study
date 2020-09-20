# 注解(Annotation)
注解是放在java源码的类、字段、方法、参数前的一种特殊"注释".  
与普通注释不同的是，注释会被编译器忽略，而注解则会被打包进class文件。因此注解是一种"元数据"。  

# 注解的作用
从JVM的角度看，注解对代码逻辑并没有什么影响，如何使用注解完全由工具决定。  
注解可以分为三类:

## 由编译器使用的注解
如：  
@Override : 让编译器检查是否对该方法进行了覆写。  
@SuppressWarnings : 告诉编译器忽略此处的代码警告。    
这类注解不会被打包进class文件。  

## 由工具处理.class的注解  
比如有些工具会在加载class的时候，对class做动态修改，实现一些特殊的功能。  
这类注解会被编译进入.class文件，但加载结束后并不会存在于内存中。这类注解只被一些底层库使用，一般我们不必自己处理。  

## 在程序运行期间读取的注解
他在加载后一直存在于JVM中，这也是最常见的一种  
如@PostConstruct的方法会在调用构造方法后自动被调用。（这是Java代码读取该注解实现的功能，JVM并不会识别该注解）。  

## 
定义一个注解时，还可以定义配置参数。配置参数可以包括：
所有基本类型；
String；
枚举类型；
基本类型、String、Class以及枚举的数组。

# 定义注解
Java使用***@interface***来定义注解，他的格式如下：

```Java
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
```

## 元注解
有些注解可以修饰其它的注解，被称为元注解(meta Annotation)。

### @Target
最常用的元注解是@Target，它可以定义Annotation可以被用在哪些地方。
类或者接口：ElementType.TYPE;  
字段：ElementType.FIELD;  
方法：ElementType.METHOD  
构造方法：ElementType.CONSTRUCTROR;  
方法参数：ElementType.PARAMETER；  
如：  
```Java
@Target(ElementType.METHOD)
public @interface Report{
    int type() default 0;
    String level() default "info";
    String value() default "";
}
```
定义Report可用在方法或字段上，则如此写注解参数：  
```Java
@Target({
    ElementType.METHOD,
    ElementType.FIELD
})
public @interface Report{
    // pass
}
```
### @Retention
@Rentention则定义了Annotation的生命周期：  
仅编译期：RetentionPolicy.SOURCE;  
仅class文件：RetentionPolicy.CLASS;  
仅运行期：RetentionPolicy.RUNTIME；  
如果未定义@Retention，则默认为CLASS。  

### @Repeatable
定义Annotation是否可重复  
```Java
@Repeatable(Reports.class)
@Target(ElementType.TYPE)
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}

@Target(ElementType.TYPE)
public @interface Reports {
    Report[] value();
}
```
经过@Repeatable修饰后，在某个类型声明处，就可以添加多个@Report注解：  
```Java
@Report(type=1, level="debug")
@Report(type=2, level="warning")
public class Hello {
}
```

### @Inherited
使用@Inherited定义子类是否可继承父类定义的Annotation。@Inherited仅针对@Target(ElementType.TYPE)类型的annotation有效，并且仅针对class的继承，对interface的继承无效：  
```Java
@Inherited
@Target(ElementType.TYPE)
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
```
在使用的时候，如果一个类用到了@Report：  
```Java
@Report(type=1)
public class Person {
}
```
则它的子类默认也定义了该注解：
```Java
public class Student extends Person {
}
```

# 如何定义Annotation
## 用@interface定义注解
```Java
public @interface Report{

}
```
## 添加参数，默认值
```Java
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
```
## 用元注解配置注解
```Java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
```
其中，必须设置@Target和@Retention，@Retention一般设置为RUNTIME，因为我们自定义的注解通常要求在运行期读取。一般情况下，不必写@Inherited和@Repeatable。

# Summary
Java使用@interface定义注解：  

可定义多个参数和默认值，核心参数使用value名称；  

必须设置@Target来指定Annotation可以应用的范围；  

应当设置@Retention(RetentionPolicy.RUNTIME)便于运行期读取该Annotation。  