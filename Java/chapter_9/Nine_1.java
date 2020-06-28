package chapter_9;

// 可以把两个类放在同一个文件中
// 但是文件中只能有一个类是公共（ public) 类。
// 公共类必须与文件同名
public class Nine_1 {
    public static void main(String[] args) {
        SimpleCircle simpleCircle=new SimpleCircle();
        System.out.println(simpleCircle.getS());
        System.out.println(new SimpleCircle(3).getPerimeter());

        //test Student
        Student student=new Student();
        System.out.printf("name is %s, age is %d, is ScienceMajor %b, and gender is %c",student.name,student.age,student.isScienceMajor,student.gender);
    }
}

class SimpleCircle{
    double radius;
    SimpleCircle(){
        radius=1;
    }
    SimpleCircle(double r){
        radius=r;
    }
    double getS(){
        return Math.PI*radius*radius;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    void setRadius(double r){
        radius=r;
    }
}

class Student{
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}