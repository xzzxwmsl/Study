package chapter_7_8;
// 二维数组的声明与创建
public class Array_3 {
    public static void main(String[] args) {
        int[][] martix;
        martix=new int[3][2];
        martix[0][0]=0;
        martix[0][1]=1;
        martix[1][0]=2;
        martix[1][1]=3;
        martix[2][0]=4;
        martix[2][1]=5;

        System.out.println(martix.length);

        // 锯齿数组
        int[][] martix1={{1,2,3},{4,5},{6}};
        System.out.printf("length of %d %d %d is %d %d %d",0,1,2, martix1[0].length,martix1[1].length,martix1[martix1.length-1].length);
        
        // 创建方式2
        int [][] martix2=new int[3][];
        martix2[0]=new int[3];
        martix2[1]=new int[2];
        martix2[2]=new int[1];

        
    }
}