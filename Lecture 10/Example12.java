import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two num to find min num ");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a<b)
        {
            System.out.println(a + " is smaller then " + b);
        }
        else
        {
            System.out.println(b + " is smaller then " + a);
        }
    }
}
