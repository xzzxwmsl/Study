package chapter_11;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;
    private static final double Pi = 3.14;

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        // this.radius = radius;
        // setColor(color);
        // setFilled(filled);
        // 不可以直接 this.color = color， 因为在GeonetricObject类中color是
        // private属性，所以它只能被其父类访问

        // 更常用写法
        super(color, filled);
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject() {
        this(0, "White", false);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Pi * radius;
    }

    public void printCircle() {
        System.out.printf("%s, radius : %f , perimeter : %f", toString(), getArea(), getPerimeter());
    }

    public String toString() {
        return super.toString() + ", radius : " + radius + ", perimeter : " + getPerimeter();
    }
}