import Lecture_20.myPackage.Circle;
import Lecture_20.myPackage.Ellipse;
import Lecture_20.myPackage.Geometry;
import Lecture_20.myPackage.Rectangle;


public class Example40 {
    public static void main(String[] args) {
        Geometry[] obj = new Geometry[3];
        obj[0] = new Circle(5.0);
        obj[1] = new Rectangle(2.0,4.0);
        obj[2] = new Ellipse(4.0,1.0);
        double totalarea = 0;
        for(int i = 0; i <3; i++)
        {
            totalarea = totalarea + obj[i].area();
        }
        System.out.println("Total area : " + totalarea);
    }
}
