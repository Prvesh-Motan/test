class Circle {
    double r;

    double circumference() {
        return 2 * 3.141 * r;
    }

    double area() {
        return 2 * 3.141 * r * r;
    }
    Circle(double a)
    {
        r = a;
    }
}

public class Example04 {
    public static void main(String arg[]) {
        Circle c1 = new Circle(6.0);
        Circle c2 = new Circle(7.0);
        System.out.println("Circumference = " + c1.circumference());
        System.out.println("Area = " + c1.area());
        System.out.println("Circumference = " + c2.circumference());
        System.out.println("Area = " + c2.area());
    }
}