package generictype;

// 尝试编写泛型
public class GenericTest {
    public static void main(String[] args) {
        PairOne<String> pairOne = new PairOne<String>("Hello", "World");
        System.out.printf("First : %s, Last : %s\n",pairOne.getFirst(),pairOne.getLast());

        PairTow<String,Integer> pairTow = new PairTow<String,Integer>("xzz", 100);
        System.out.printf("First : %s, Last : %s\n",pairTow.getFirst(),pairTow.getLast());

        PairTow<String,String> pairTow2 = PairTow.create("first", "last");
        System.out.printf("First : %s, Last : %s\n",pairTow2.getFirst(),pairTow2.getLast());
        
    }
}


class PairOne<T> {
    private T first;
    private T last;

    public PairOne(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 静态函数应加入<K>前置，此处的K与T不是同一个擦拭类型(对泛型而言)
    public static <K> PairOne<K> create(K first, K last) {
        return new PairOne<K>(first, last);
        // return new PairOne(first, last); // 错误写法，应当加入<K>做类型约束
    }
}

// 多泛型类型
class PairTow<T, K> {
    private T first;
    private K last;

    public PairTow(T first, K last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public K getLast() {
        return last;
    }

    public static <M, N> PairTow<M, N> create(M first, N last) {
        return new PairTow<M, N>(first, last);
    }
}