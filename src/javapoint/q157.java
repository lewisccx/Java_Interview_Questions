package javapoint;

class Test157
{
    public static void main (String args[])
    {
        String s1 = "Sharma is a good player";
        String s2 = new String("Sharma is a good player");
        s2 = s2.intern();
        System.out.println(s1 == s2);
    }
}
// true
//The intern method returns the String object reference from the string pool.
//        In this case, s1 is created by using string literal whereas, s2 is created by using the String pool.
//        However, s2 is changed to the reference of s1, and the operator == returns true.