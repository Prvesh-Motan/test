class Point
{
    int x;
    int y;
    void setPoint()
    {
        x = 7;
        y = 10;
    }
}
public class Example01 {
    public static void main (String agr[])
    {
        Point p = new Point();
        p.setPoint();
        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    } 
}
