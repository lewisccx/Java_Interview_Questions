package javapoint;

class Test38 {
    int test_a, test_b;

    Test38(int a, int b) {
        test_a = a;
        test_b = b;
    }
}
    public class q38 {
        public static void main (String args[])
        {
//            javapoint.Test38 test = new javapoint.Test38();
//            System.out.println(test.test_a+" "+test.test_b);
        }
    }
//There is a compiler error in the program because there is a call to the default constructor
//in the main method which is not present in the class.
//However, there is only one parameterized constructor in the class javapoint.Test.
//Therefore, no default constructor is invoked by the constructor implicitly.