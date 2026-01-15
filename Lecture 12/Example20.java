import java.util.Scanner;

class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

public class Example20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number ");
        Fibonacci a = new Fibonacci(s.nextInt());
        System.out.print("\n");
        for (int i = 0; i < a.n; i++) {
            System.out.print(" " + a.fibonacci(i));
        }
    }
}
