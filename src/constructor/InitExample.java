package constructor;

public class InitExample {

    // block to be executed first
    {
        System.out.println("init");
    }
    InitExample()
    {
        System.out.println("default");
    }
    InitExample(int x)
    {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }
    public static void main(String args[])
    {
        new InitExample();
        new InitExample(10);
    }
}
