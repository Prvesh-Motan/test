// one class two oobject

class Point
{
    int x;
    int y;
    void setPoint(int a, int b)
    {
        x = a;
        y = b;
    }
}
public class Example03 {
    public static void main (String agr[])
    {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setPoint(15,10);
        p2.setPoint(1,4);
        System.out.println("x = " + p1.x);
        System.out.println("y = " + p1.y);
        System.out.println("x = " + p2.x);
        System.out.println("y = " + p2.y);

    } 
}

