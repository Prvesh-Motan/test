// Default access modifier
class A 
{
    void msg()
    {
        System.out.println("Hi ! I am in class A");
    }
}
class Example33 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}
