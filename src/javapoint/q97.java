package javapoint;

class Base97
{
    protected final void getInfo()
    {
        System.out.println("method of javapoint.Base class");
    }
}

class Derived97 extends Base97
{
//    protected final void getInfo()
//    {
//        System.out.println("method of javapoint.Derived class");
//    }
    public static void main(String[] args)
    {
        Base97 obj = new Base97();
        obj.getInfo();
    }
}
// compile error getInfo() in javapoint.Derived cannot override getInfo() in javapoint.Base97
// The getInfo() method is final; therefore it can not be overridden in the subclass.