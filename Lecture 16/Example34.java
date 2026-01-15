// public access modifier
class A 
{
    public int data = 10;
    public void msg()
    {
        System.out.println("Class A: hello world");
    }
}
public class Example34 {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
        obj.msg(); 
    }
}
