package chapter_9;

//静态变量，常量，方法
public class Nine_3 {
    public static void main(String[] args) {
        System.out.println(
                "Before create a object, the number of numOfObjects is : " + CircleWithStaticMembers.getNumberOfObjects());

        CircleWithStaticMembers circleWithStaticMembers = new CircleWithStaticMembers();
        CircleWithStaticMembers circleWithStaticMembers2 = new CircleWithStaticMembers(2);
        System.out.printf("Area of 1 is %f, area of 2 if %f\n", circleWithStaticMembers.getArea(),
                circleWithStaticMembers2.getArea());
        System.out.println("The number of numberOfObjects now is " + CircleWithStaticMembers.getNumberOfObjects());
        CircleWithStaticMembers circleWithStaticMembers3;
        circleWithStaticMembers3=circleWithStaticMembers;
        System.out.printf("Area of 1 is %f, area of 2 if %f, area of 3 if %f \n", circleWithStaticMembers.getArea(),
                circleWithStaticMembers2.getArea(),circleWithStaticMembers3.getArea());
        System.out.println("The number of numberOfObjects now is " + CircleWithStaticMembers.getNumberOfObjects());
        
        // 
        circleWithStaticMembers2=new CircleWithStaticMembers(2);
        System.out.printf("Area of 1 is %f, area of 2 if %f, area of 3 if %f \n", circleWithStaticMembers.getArea(),
                circleWithStaticMembers2.getArea(),circleWithStaticMembers3.getArea());
        System.out.println("The number of numberOfObjects now is " + CircleWithStaticMembers.getNumberOfObjects());

    }
}

class CircleWithStaticMembers {
    private static int numberOfObjects = 0;
    final static double Pi = 3.14;
    private double radius;

    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double r) {
        radius = r;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return Pi * radius * radius;
    }
}