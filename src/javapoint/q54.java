package javapoint;

class Test54
{
    static int i = 10;
    public Test54 ()
    {
        System.out.println(this.i);
    }
    public static void main (String args[])
    {
        Test54 t = new Test54();
    }
}
//Yes, It is possible to use this keyword to refer static members because
// this is just a reference variable which refers to the current class object.
// However, as we know that, it is unnecessary to access static variables through objects,
// therefore, it is not the best practice to use this to refer static members. Consider the following example.