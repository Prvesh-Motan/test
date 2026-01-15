class Circle {
    double x, y;
    double r;

    double circumference() {
        return 2 * 3.141 * r;
    }

    double area() {
        return 2 * 3.141 * r * r;
    }
}

public class SingleClass {
    public static void main(String arg[]) {
        Circle c = new Circle();
        c.x = 1.0;
        c.y = 3.0;
        c.r = 5.0;
        System.out.println("Circumference = " + c.circumference());
        System.out.println("Area = " + c.area());
    }
}
