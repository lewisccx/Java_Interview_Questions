package javapoint;

class Calculation extends Exception
{
    public Calculation()
    {
        System.out.println("javapoint.Calculation class is instantiated");
    }
    public void add(int a, int b)
    {
        System.out.println("The sum is "+(a+b));
    }
}
class Main143{
    public static void main(String []args){
        try
        {
            throw new Calculation();
        }
        catch(Calculation c){
            c.add(10,20);
        }
    }
}

//javapoint.Calculation class is instantiated
//        The sum is 30

//The object of javapoint.Calculation is thrown from the try block which is caught in the catch block.
//        The add() of javapoint.Calculation class is called with the integer values 10 and 20 by
//        using the object of this class. Therefore there sum 30 is printed.
//        The object of the Main class can only be thrown in the case when the type of the object is throwable.
//        To do so, we need to extend the throwable class.