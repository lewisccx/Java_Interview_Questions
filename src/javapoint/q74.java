package javapoint;

// Can we overload the methods by making them static?
// No, We cannot overload the methods by just applying the static keyword to them
// (number of parameters and types are the same). Consider the following example.
// compile error
class Animal74
{
//    void consume(int a)
//    {
//        System.out.println(a+" consumed!!");
//    }
    static void consume(int a)
    {
        System.out.println("consumed static "+a);
    }

    public static void main (String[] args)
    {

        Animal74 a = new Animal74();
        a.consume(10);
        Animal74.consume(20);
    }


}
