package chapter_12.FileStudy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrintWriterTest {
    public static void main(String[] args) throws Exception {
        // method 1 , 必须手动关闭close
        java.io.File file = new java.io.File("chapter_12/score.txt");

        java.io.PrintWriter printWriter = new java.io.PrintWriter(file);
        printWriter.println("HELLO! WELCOME TO IO WORLD!");
        printWriter.printf("%s %d\t\t\t\t", "LIHUA", 32);
        printWriter.printf("%s %d\n", "LIUHUA", 312);
        printWriter.printf("%s %d\t\t\t\t", "ZHAOHUA", 322);
        printWriter.printf("%s %d\n", "ZHEHUA", 322);
        // 这种方式打开必须使用close关闭
        printWriter.close();

        // method 2, 这样不需要手动close
        try (Scanner in = new Scanner(file);) {
            while (in.hasNext()) {
                String s = in.nextLine();
                System.out.println(s);
            }
        }

    }
}