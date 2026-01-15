class A
{
    // private A()
    // {
    //     System.out.println("hello world");
    // } // compile time error due to this
    void msg()
    {
        System.out.println("Class A");
    }
}
public class Example36 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}
