// private access modifier
class A{
    private int data = 40;
    public void msg()
    {
        System.out.println("Class A ! hello world " + data);
    }
}
public class Example35 {
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.data); // compile time error due to private modifier
        obj.msg();// "data" is accessable through public methon in function msg
    }
}
