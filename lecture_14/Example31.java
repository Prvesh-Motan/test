abstract class Base{
     void fun()
     {
        System.out.println("Base fun() is called");
     }
}
class Derived extends Base{
    Derived()
    {
        System.out.println("Derived constructor is called");
        super.fun();
    }
    void fun()
    {
        System.out.println("derived fun() is called");
    }
}
public class Example31 {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.fun();
    }
}
