package chapter_7_8;

import java.util.Arrays;

// Arrays 类的使用
public class Array_2 {
    public static void main(String[] args) {
        int[] array1 = createRandomArray(15, 1, 100);
        int[] array2 = createRandomArray(15, 1, 100);
        showArray("array1", array1);
        java.util.Arrays.sort(array1);
        showArray("array1", array1);

        showArray("array2", array2);
        Arrays.parallelSort(array2,1,5);// 对array[low]~array[high-1]进行增序排序
        showArray("array2", array2);

        int[] array3 = { 9, 7, 5, 3, 1, 2, 4, 6, 8 };
        java.util.Arrays.sort(array3);
        System.out.printf("index of %d is %d, index of %d is %d\n", 131, java.util.Arrays.binarySearch(array3, 131), 1,
                java.util.Arrays.binarySearch(array3, 1));// 二分查找必须为增序有序数组

        int[] arrayNew1 = { 1, 2, 3, 4 };
        int[] arrayNew2 = { 1, 2, 3, 4 };
        int[] arrayNew3 = { 2, 1, 3, 4 };
        System.out.println(java.util.Arrays.equals(arrayNew1, arrayNew2));
        System.out.println(java.util.Arrays.equals(arrayNew1, arrayNew3));

        // 可以使用 fill 方法填充整个数组或部分数组

        java.util.Arrays.fill(array1, 1);
        showArray("array1", array1);

        java.util.Arrays.fill(array1, 1, 7, 2);
        showArray("array1", array1);

        System.out.println(java.util.Arrays.toString(array2));
    }

    public static int[] createRandomArray(int len, int low, int high) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = (int) (low + Math.random() * (high - low + 1));
        }

        return array;
    }

    public static void showArray(String str, int[] array) {
        System.out.println(str + ":");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}