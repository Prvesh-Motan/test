package Lecture_20;

import Lecture_20.hello.Geometryx;

public class Circle extends Geometryx
{
    private double r;

    public Circle() {
        r = 1.0;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        double a = PI * r * r;
        return a;
    }

    @Override
    public double circumference() {
        double b = 2 * PI * r;
        return b;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area of circle = " + c.area());
        System.out.println("Circumference of circle = " + c.circumference());
    }
}   

