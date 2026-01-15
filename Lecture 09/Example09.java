import java.util.Scanner;

public class Example09 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two num to find greater num ");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b)
        {
            System.out.println(a +" is greater then " + b);
        }
        else
        {
            System.out.println(b + " is greater then " + a);
        }
    }
}
