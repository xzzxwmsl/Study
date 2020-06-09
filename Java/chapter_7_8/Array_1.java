package chapter_7_8;

// 数组的声明、创建、匿名数组创建，方法调用数组


public class Array_1 {
    public static void main(String[] args) {
        int[] intArray1;
        intArray1 = new int[10];

        int[] intArray2 = new int[10];

        for (int i = 0; i < 5; i++) {
            intArray1[i] = i;
            intArray2[i] = i * i;
        }
        // 创建数组后默认值为0
        for (int i = 0; i < 10; i++) {
            intArray1[i] = i;
            System.out.printf("intArray1[%d] : %d\tintArray2[%d] : %d\n", i, intArray1[i], i, intArray2[i]);
        }

        int[] intArray3 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(intArray3.length);

        // 此处 i 是元素而非index
        showArray(intArray3);

        // 并没有把intArray2的值复制到intArray3
        // 而是把intArray3引用设置为了intArray2的引用。 详解见NOTE.md

        intArray3 = intArray2;
        showArray(intArray3);

        // arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
        System.arraycopy(intArray1, 1, intArray3, 0, 6);
        showArray(intArray3);
        showArray(intArray1);

        // 匿名数组
        showArray(new int[] { 1, 3, 1, 4, 5, 2, 0 });
        // 方法返回数组
        showArray(reserveArray(new int[] { 1, 2, 3, 4, 5 }));

        // 可变长参数
        showFunc(3,1,2,3,4,5,6);
        showFunc(10,1,2,3,4,5,6);
        showFunc(4, intArray3);
        showFunc(20, intArray3);

        //Arrays类


    }

    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static int[] reserveArray(int[] array) {
        int[] arrayNew = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[array.length - i - 1];
        }
        return arrayNew;
    }

    public static void showFunc(int i, int... array) {
        if(i>array.length) i=array.length;
        for (int j = 0; j < i; j++) {
            System.out.printf("%d ", array[j]);
        }
        System.out.println();
    }
}