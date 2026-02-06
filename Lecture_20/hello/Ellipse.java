package Lecture_20.hello;

public class Ellipse extends Geometryx {
    protected double a,b;
    public Ellipse()
    {
        a = 0.0;
        b = 0.0;
    }
    public Ellipse(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public double area(){
        return PI*a*b;
    }
    public double circumference()
    {
        return PI*(a+b);
    }
    

}
