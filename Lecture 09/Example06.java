import java.lang.Math;

class Calculator {
    double i;
    double x= Math.sqrt(i);

}

public class Example06 {
    public static void main(String args[]) {
        Calculator a = new Calculator();
        a.i = 10;
        System.out.println("Square root of " + a.i + " is " + a.x);
    }
}
