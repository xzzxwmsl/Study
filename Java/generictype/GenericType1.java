package generictype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericType1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // 使用ArrayList时，如果不定义泛型类型时，泛型类型实际上就是Object：
        List testList = new ArrayList();
        testList.add("Hello");
        testList.add(" World");
        String re = (String)testList.get(0)+(String)testList.get(1);
        System.out.println(re);

        String[] s = new String[]{"Beijing","Shanghai","Chengdu"};
        Arrays.sort(s);
        for (String string : s) {
            System.out.println(string);
        }

        int[] intArray = {1,212,21,31,23,21,12,3};
        Arrays.sort(intArray);
        for (int i : intArray) {
            System.out.println(i);
        }

    }
}
