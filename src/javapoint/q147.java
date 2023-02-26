package javapoint;

//In the main method, a() of Main is called which prints a message and call b().
//        The method b() prints some message and then call c().
//        The method c() throws an exception which is handled by the catch block of method b.
//        However, It propagates this exception by using throw Exception() to be handled by the method a().
//        As we know, finally block is always executed
//        therefore the finally block in the method b() is executed first and prints a message.
//        At last, the exception is handled by the catch block of the method a().
class Main147
{
    void a()
    {
        try{
            System.out.println("a(): Main called");
            b();
        }catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
    void b() throws Exception
    {
        try{
            System.out.println("b(): Main called");
            c();
        }catch(Exception e){
            throw new Exception();
        }
        finally
        {
            System.out.println("finally block is called");
        }
    }
    void c() throws Exception
    {
        throw new Exception();
    }

    public static void main (String args[])
    {
        Main147 m = new Main147();
        m.a();
    }
}
//     a(): Main called
//     b(): Main called
//     finally block is called
//     Exception is caught