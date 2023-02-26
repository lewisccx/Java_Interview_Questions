package javapoint;//ArithmaticException is the subclass of Exception.
//Therefore, it can not be used after Exception. Since Exception is the base class for all the exceptions,
//therefore, it must be used at last to handle the exception. No class can be used after this.

class ExceptionHandlingExample {
    public static void main(String args[])
    {
        try
        {
            int a = 1/0;
            System.out.println("a = "+a);
        }
        catch(Exception e){System.out.println(e);}
       //catch(ArithmeticException ex){System.out.println(ex);}
    }
}

//javapoint.ExceptionHandlingExample.java:10: error: exception ArithmeticException has already been caught
//        catch(ArithmeticException ex){System.out.println(ex);}
//        ^
//        1 error