package javapoint;

class Base
{
    void method(int a)
    {
        System.out.println("javapoint.Base class method called with integer a = "+a);
    }

    void method(double d)
    {
        System.out.println("javapoint.Base class method called with double d ="+d);
    }
}

class Derived extends Base
{
    @Override
    void method(double d)
    {
        System.out.println("javapoint.Derived class method called with double d ="+d);
    }
}

class Main86
{
    public static void main(String[] args)
    {

        new Derived().method(10);
        Derived d = new Derived();
                d.method(10.20);
                Base b = new Base();
                b.method(15.6);
    }
}
//javapoint.Base class method called with integer a = 10
// The method() is overloaded in class javapoint.Base whereas it is derived in class javapoint.Derived with the double type
// as the parameter. In the method call, the integer is passed.