class Animal
{
    String color = "White";
}
class Dog extends Animal
{
    String color ="black";
    void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Example22 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolor();
    }
}
