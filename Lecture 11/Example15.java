class Circle
{
    static int circlecount = 0;
    double x,y,r;
    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
        circlecount++;
    }
    public Circle(double r)
    {
        this.x = 0.0;
        this.y = 0.0;
        this.r =r;
        circlecount++;
    }
    public Circle()
    {
        this.x = 0.0;
        this.y = 0.0;
        this.r =0.1;
        circlecount++;
    }
    double circumference()
    {
        return(2*3.141*r);
    }
    double area()
    {
        return(3.141*r*r);
    }

}
public class Example15 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.0);
        System.out.println("c1 circle count " + c1.circlecount);
        System.out.println("c2 circle count " + c2.circlecount);
    }
}
