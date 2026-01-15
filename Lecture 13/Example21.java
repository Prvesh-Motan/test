class Point2D{
    int x;
    int y;
    void display(){
        System.out.println("X-" +x+" Y-"+y);
    }
}
class Point3D extends Point2D{
    int z;
    void display()
    {
        System.out.println("X-"+x+" Y-"+y+" Z-"+z);
    }
}
public class Example21 
{
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        p1.x = 10;
        p1.y = 15;
        p1.display();
        p2.x = 12;
        p2.y = 17;
        p2.z = 19;
        p2.display();
    }
}