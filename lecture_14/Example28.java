class A {
    int i;
}
class B extends A{
    int i;
    B(int a, int b)
    {
        super.i = a;
        i = b;
    }
    void show()
    {
        System.out.println("i in superclass " + super.i);
        System.out.println("i in subclass " + i);
    }
}
public class Example28 {
    public static void main(String[] args) {
        B obj = new B(12,18);
        obj.show();
    }
}
