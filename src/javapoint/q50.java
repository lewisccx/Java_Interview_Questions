package javapoint;
//Yes, we can declare static variables and methods in an abstractExample method.
//As we know that there is no requirement to make the object to access the static context,
//therefore, we can access the static context declared inside the abstractExample class
//by using the name of the abstractExample class. Consider the following example.

 class Test50
{
    static int i = 102;
    static void TestMethod()
    {
        System.out.println("hi !! I am good !!");
    }
}
public class q50 extends Test50 {
    public static void main (String args[])
    {
        Test50.TestMethod();
        System.out.println("i = "+Test50.i);
    }
}
//hi !! I am good !!
//        i = 102