package javapoint;

class Base89
{
    public void baseMethod()
    {
        System.out.println("BaseMethod called ...");
    }
}
class Derived89 extends Base89
{
    public void baseMethod()
    {
        System.out.println("javapoint.Derived method called ...");
    }
}
class Test89
{
    public static void main (String args[])
    {
        //javapoint.Base89 b = new javapoint.Derived89();
        // javapoint.Derived method called ...
        //javapoint.Base89 b = new javapoint.Base89();
        //BaseMethod called ...
        //b.baseMethod();
    }
}
//The method of javapoint.Base class, i.e., baseMethod() is overridden in javapoint.Derived class.
// In javapoint.Test class, the reference variable b (of type javapoint.Base class) refers to the instance of the javapoint.Derived class.
// Here, Runtime polymorphism is achieved between class javapoint.Base and javapoint.Derived.
// At compile time, the presence of method baseMethod checked in javapoint.Base class,
// If it presence then the program compiled otherwise the compiler error will be shown.
// In this case, baseMethod is present in javapoint.Base class; therefore, it is compiled successfully.
// However, at runtime, It checks whether the baseMethod has been overridden by javapoint.Derived class,
// if so then the javapoint.Derived class method is called otherwise javapoint.Base class method is called.
// In this case, the javapoint.Derived class overrides the baseMethod; therefore, the javapoint.Derived class method is called.