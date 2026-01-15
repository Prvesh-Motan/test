class Circle {
    double x, y;
    double r;

    double circumference() {
        return 2 * 3.141 * r;
    }

    double area() {
        return 2 * 3.141 * r * r;
    }
    Circle (double a, double b,double c)
    {
        x =a;
        y = b;
        r = c;
    }
}
class Constructor
{
    public static void main (String arg[])
    {
        Circle c1 = new Circle(3.0,4.0,5.0);
        Circle c2 = new Circle(4.0,9.0,8.0);
        System.out.println("Circumference of c1 = " + c1.circumference());
        System.out.println("Area of c1 = " + c1.area());
        System.out.println("Circumference of c2 = " + c2.circumference());
        System.out.println("Area of c2 = " + c2.area());
    }
}