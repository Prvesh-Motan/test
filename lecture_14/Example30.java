abstract class Base{
    abstract void fun();
}
class Derived extends Base{
    void fun()
    {
        System.out.println("derived fun() is called");
    }
}
public class Example30 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
