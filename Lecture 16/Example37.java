// pritected modifier
class A {
    protected int rollno = 21;
    protected void msg()
    {
        System.out.println("Hello roll no " + rollno);
    }
}
public class Example37 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
        System.out.println(obj.rollno);
    }
}
