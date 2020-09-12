package chapter_13;


public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date createDate;

    protected GeometricObject() {
        this("NULL", false);
        
    }

    protected GeometricObject(String color, boolean filled) {
        createDate = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public java.util.Date getDate() {
        return createDate;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this(0, "NULL", false);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("create Date %s, filled %b, color %s, Area %f, Perimeter %f", getDate(), isFilled(),
                getColor(), getArea(), getPerimeter());
    }
}
