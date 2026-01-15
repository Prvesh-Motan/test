import java.lang.*;
class Calculator
{
    double i;
    double x;
    void p()
    {
        x = Math.sqrt(i);
    }
}
public class Example38 {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.i = 9;
        a.p();
        System.out.println("Square root of "+a.i+" is "+a.x);
    }
}
