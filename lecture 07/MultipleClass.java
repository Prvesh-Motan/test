class Box{
    double hight;
    double width;
    double depth;
    double area(){
        double a;
        a = (hight*width + hight*depth + depth*width);
        return a;
    }
    double volume(){
        double y;
        y = hight*width*depth;
        return y;
    }
}
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
public class MultipleClass {
     public static void main(String arg[]) {
        Circle c = new Circle();
        Box b = new Box();
        c.x = 1.0;
        c.y = 3.0;
        c.r = 5.0;
        b.hight = 6.0;
        b.depth = 7.0;
        b.width = 4.0;
        System.out.println("Circumference = " + c.circumference());
        System.out.println("Area = " + c.area());
        System.out.println("Volume = " + b.volume());
        System.out.println("Area = " + b.area());

    }
}
