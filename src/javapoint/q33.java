package javapoint;

class Test33
{
    int i;
    public Test33(int k)
    {
        i=k;
    }
    public Test33(int k, int m)
    {
        System.out.println("Hi I am assigning the value max(k, m) to i");
        if(k>m)
        {
            i=k;
        }
        else
        {
            i=m;
        }
    }
}
public class q33 {
    public static void main (String args[])
    {
        Test33 test1 = new Test33(10);
        Test33 test2 = new Test33(12, 15);
        System.out.println(test1.i);
        System.out.println(test2.i);
    }
}
//In the above program, The constructor Test is overloaded with another constructor.
// In the first call to the constructor, The constructor with one argument is called,
// and i will be initialized with the value 10. However, In the second call to the constructor,
// The constructor with the 2 arguments is called, and i will be initialized with the value 15.