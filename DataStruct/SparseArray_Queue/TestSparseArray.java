package SparseArray_Queue;

public class TestSparseArray {
    public static void main(String[] args) {
        int[][] testArray = new int[4][5];
        testArray[0][1] = 2;
        testArray[3][4] = -1;
        testArray[2][2] = 100;
        System.out.println("--------原始矩阵如下：----------");
        showArray(testArray);

        int[][] sparseArray = SparseArray.getSparseArray(testArray);// 得到稀疏矩阵

        System.out.println("--------稀疏矩阵如下：----------");
        showArray(sparseArray);

        System.out.println("--------读取稀疏矩阵如下：----------");
        int[][] readSparseArray=SparseArray.readSparseArray(sparseArray);
        showArray(readSparseArray);
    }

    public static void showArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
