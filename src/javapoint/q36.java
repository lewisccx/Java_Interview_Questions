package javapoint;

class Test {
    Test(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    Test(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }
}
    public class q36 {
        public static void main (String args[])
        {
            byte a = 10;
            byte b = 15;
            Test test = new Test(a,b);
        }
    }
//Here, the data type of the variables a and b, i.e., byte gets promoted to int,
//        and the first parameterized constructor with the two integer parameters is called.