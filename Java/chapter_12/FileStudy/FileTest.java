package chapter_12.FileStudy;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("chapter_12/images/File类.png");
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());
        System.out.println(new java.util.Date(file.lastModified()));
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        System.out.println("-------------------------");
        file = new File("chapter_12/images");
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());
        System.out.println(new java.util.Date(file.lastModified()));
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        System.out.println(file.list());
        System.out.println(file.listFiles());
    }
}