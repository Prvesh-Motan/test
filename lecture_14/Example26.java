class A
{
    int i,j;
    void showij()
    {
        System.out.println("i and j : "+i+" "+j);
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("k : "+k);
    }
    void sum()
    {
        System.out.println("i + j + k : "+(i+j+k));
    }
}
public class Example26 {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 15;
        superOb.showij();
        System.out.println();
        subOb.i = 5;
        subOb.j = 7;
        subOb.k = 3;
        System.out.println("content of subOb");
        subOb.showij();
        subOb.showk();
        System.out.println();
        subOb.sum();

    }
}
