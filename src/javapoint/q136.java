package javapoint;
//136) Is it necessary that each try block must be followed by a catch block?

// It is not necessary that each try block must be followed by a catch block.
// It should be followed by either a catch block OR a finally block.
// So whatever exceptions are likely to be thrown should be declared in the throws clause of the method.
// Consider the following example.
class Main136{
    public static void main(String []args){
        try{
            int a = 1;
            System.out.println(a/0);
        }
        finally
        {
            System.out.println("rest of the code...");
        }
    }
}
//    Exception in thread main java.lang.ArithmeticException:/ by zero
//        rest of the code...