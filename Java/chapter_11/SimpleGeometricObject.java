package chapter_11;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "White";
    private boolean filled = false;
    private java.util.Date createDate;

    public SimpleGeometricObject() {
        createDate = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled) {
        createDate = new java.util.Date();
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public java.util.Date getDate() {
        return createDate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void serDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public String toString() {
        return String.format("create on : %s, color : %s, filled : %b", createDate, color, filled);
    }
}
