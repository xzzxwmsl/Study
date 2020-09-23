# GenericType(泛型)

泛型就是定义一种模板，例如ArrayList<T>，然后在代码中为用到的类创建对应的ArrayList<类型>  

```Java
ArrayList<String> strList = new ArrayList<>();
```
由编译器针对类型作检查：

```Java
strList.add("hello"); // OK
String s = strList.get(0); // OK
strList.add(new Integer(123)); // compile error!
Integer n = strList.get(0); // compile error!
```

这样一来，既实现了编写一次，万能匹配，又通过编译器保证了类型安全：这就是泛型。

## 向上转型
在Java标准库中的ArrayList<T>实现了List<T>接口，它可以向上转型为List<T>

```Java
public class ArrayList<E> implements List<T>{
    ...
}
List<String> str = new ArrayList<String>();
```
即类型ArrayList<T>可以向上转型为List<T>。  

***特别注意***：不能把ArrayList<Integer>向上转型为ArrayList<Number>或List<Number>。
