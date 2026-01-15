class Box
{
    double width;
    double height;
    double depth;
    Box()
    {
        width = 1.0;
        height = 2.0;
        depth = 5.0;
    }
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class BoxWeight extends Box
{
    double weight;
    BoxWeight(double w, double h, double d, double m)
    {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
public class Example27 
{
    public static void main(String[] args) {
        Box  mybox1 = new Box();
        BoxWeight mybox2 = new BoxWeight(2.0, 3, 6, .48);
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of mybox1 is "+vol);
        vol = mybox2.volume();
        System.out.println("volume of myobx2 is " + vol);
        System.out.println("weight of mybox2 is " + mybox2.weight);
    }
    
}