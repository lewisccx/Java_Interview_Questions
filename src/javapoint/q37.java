package javapoint;

class Test37
{
    int i;
}
public class q37 {
    public static void main (String args[])
    {
        Test37 test = new Test37();
        System.out.println(test.i);
    }
}
//    The output of the program is 0 because the variable i is initialized to 0 internally.
//        As we know that a default constructor is invoked implicitly
//        if there is no constructor in the class, the variable i is initialized to 0
//        since there is no constructor in the class.