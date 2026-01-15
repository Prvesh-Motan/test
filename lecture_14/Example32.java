abstract class Base{
   final void fun()
   {
    System.out.println("Final fun() is called");
   }
}
class Derived extends Base{
    Derived()
    {
        System.out.println("derived construstor is called");
        // void fun(){
        //     System.out.println("Derived fun() is called");
        // } // we can't override any finals function.
    }
}
public class Example32 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
