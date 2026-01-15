
class Circle {
    static double x, y, r;

    Circle(double r) {
        this.r = r;
    }

    public static class Point {
        double x, y;

        void display() {
            System.out.println("(x,y) = " + this.x + "," + this.y);
        }

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }
}

public class Example16 {
    public static void main(String args[]) {
        Circle a = new Circle(2.0);
        Circle.Point po = new Circle.Point(1.0, 3.0);
        po.display();
        
    }
}
