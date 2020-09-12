package SparseArray_Queue;

public class SparseArray {
    public static int getValuedLength(int[][] array) {
        int sum = 0;
        for (int[] i : array) {
            for (int j : i) {
                if (j != 0)
                    sum++;
            }
        }
        return sum;
    }

    public static int[][] getSparseArray(int[][] array, int sum) {
        int[][] newArray = new int[sum + 1][3];
        newArray[0][0] = array.length;// 原始数组的行数
        newArray[0][1] = array[0].length;// 列数
        int flag = 1;// 记录当前正在处理原始数组的第几个元素
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    newArray[flag][0] = i;
                    newArray[flag][1] = j;
                    newArray[flag++][2] = array[i][j];// 记录值
                }
            }
        }
        return newArray;

    }

    public static int[][] readSparseArray(int[][] sparseArray) {
        int row = sparseArray[0][0];
        int col = sparseArray[0][1];

        int[][] array = new int[row][col];
        for (int i = 1; i < sparseArray.length; i++) {
            int rowOfValue = sparseArray[i][0];
            int colOfValue = sparseArray[i][1];
            int value = sparseArray[i][2];
            array[rowOfValue][colOfValue] = value;//还原值
        }
        return array;
    }
}