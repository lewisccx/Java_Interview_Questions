package javapoint;

class BaseTest
{
    void print()
    {
        System.out.println("javapoint.BaseTest:print() called");
    }
}
 class Test105 extends BaseTest
{
    void print()
    {
        System.out.println("javapoint.Test:print() called");
    }
    public static void main (String args[])
    {
        BaseTest b = new Test105();
        b.print();
    }
}
//It is an example of Dynamic method dispatch.
// The type of reference variable b is determined at runtime.
// At compile-time, it is checked whether that method is present in the javapoint.Base class.
// In this case, it is overridden in the child class, therefore, at runtime the derived class method is called.