package chapter_12;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    CircleWithException() {
        this(1.0);
    }

    CircleWithException(double Nradius) {
        // this.radius = radius;
        setRadius(Nradius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("radius should >= 0 !");
        }
    }

    public static int getNumberOfObjects() {
        return CircleWithException.numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}