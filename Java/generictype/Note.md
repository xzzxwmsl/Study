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

---

## 向上转型
在Java标准库中的ArrayList<T>实现了List<T>接口，它可以向上转型为List<T>

```Java
public class ArrayList<E> implements List<T>{
    ...
}
List<String> str = new ArrayList<String>();
```
即类型ArrayList<T>可以向上转型为List<T>。  

***特别注意***：不能把ArrayList\<Integer\>向上转型为ArrayList\<Number\>或List\<Number\>。  
假设我们将ArrayList\<Integer>转化为ArrayList\<Number>：  

```java
// 创建ArrayList<Integer>类型：
ArrayList<Integer> integerList = new ArrayList<Integer>();
// 添加一个Integer：
integerList.add(new Integer(123));
// “向上转型”为ArrayList<Number>：
ArrayList<Number> numberList = integerList;
// 添加一个Float，因为Float也是Number：
numberList.add(new Float(12.34));
// 从ArrayList<Integer>获取索引为1的元素（即添加的Float）：
Integer n = integerList.get(1); // ClassCastException!
```
我们把一个ArrayList\<Integer>转型为ArrayList\<Number>类型后，这个ArrayList\<Number>就可以接受Float类型，因为Float是Number的子类。但是，ArrayList\<Number>实际上和ArrayList\<Integer>是同一个对象，也就是ArrayList\<Integer>类型，它不可能接受Float类型， 所以在获取Integer的时候将产生ClassCastException。  
实际上，编译器为了避免这种错误，根本就不允许把ArrayList\<Integer>转型为ArrayList\<Number>。

---

## 泛型接口
除了ArrayList<T>使用了泛型，还可以在接口中使用泛型。例如，Arrays.sort(Object[])可以对任意数组进行排序，但待排序的元素必须实现Comparable<T>这个泛型接口：  
```Java
public interface Comparable<T> {
    /**
     * 返回负数: 当前实例比参数o小
     * 返回0: 当前实例与参数o相等
     * 返回正数: 当前实例比参数o大
     */
    int compareTo(T o);
}
```

如果自定义的类要实现Arrays.sort()的功能，那么就要实现Comparable<T>这个接口