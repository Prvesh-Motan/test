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
public class Example02 {
    public static void main (String agr[])
    {
        Point p = new Point();
        p.setPoint(15,10);
        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    } 
}

