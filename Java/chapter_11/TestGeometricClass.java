package chapter_11;

public class TestGeometricClass {
    public static void main(String[] args) {
        SimpleGeometricObject geoTest = new SimpleGeometricObject("Blue", true);
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(10, "Yellow", true);

        System.out.println(geoTest.getDate());
        System.out.println(geoTest.getColor());
        System.out.println(geoTest.toString());
        System.out.println("-----------------------------");
        System.out.println(circle.getDate());
        System.out.println(circle.getColor());
        System.out.println(circle.toString());
        circle.printCircle();
    }
}