package Lecture_20.myPackage;

public class Circle extends Geometry {
    private double r;

    public Circle() {
        r = 1.0;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double circumference() {
        return 2 * PI * r;
    }
}
