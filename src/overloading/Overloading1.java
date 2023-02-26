package overloading;

public class Overloading1 {
    public static int foo(int a) { return 10; }
    public static int foo(int a, int b) { return 'a'; }

    public static void main(String args[])
    {
        System.out.println(foo(1));
        System.out.println(foo(1,2));
    }
}
