import java.util.Scanner;

public class Example08 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first num ");
        num1 = s.nextInt();
        System.out.println("Enter second num ");
        num2 = s.nextInt();
        System.out.println("Sum of no. is = " + (num1+num2));
    }
}
