package javapoint;

class Calculation149
{
    int a;
    public Calculation149(int a)
    {
        this.a = a;
    }
    public int add()
    {
        a = a+10;
        try
        {
            a = a+10;
            try
            {
                a = a*10;
                throw new Exception();
            }catch(Exception e){
                a = a - 10;
            }
        }catch(Exception e)
        {
            a = a - 10;
        }
        return a;
    }

    public static void main (String args[])
    {
        Calculation149 c = new Calculation149(10);
        int result = c.add();
        System.out.println("result = "+result);
    }
}
//The instance variable a of class javapoint.Calculation is initialized to 10 using the class constructor
// which is called while instantiating the class. The add method is called which returns an integer value result.
// In add() method, a is incremented by 10 to be 20. Then, in the first try block,
// 10 is again incremented by 10 to be 30. In the second try block, a is multiplied by 10 to be 300.
// The second try block throws the exception which is caught by the catch block associated with this try block.
// The catch block again alters the value of a by decrementing it by 10 to make it 290.
// Thus the add() method returns 290 which is assigned to result. However,
// the catch block associated with the outermost try block will never be executed
// since there is no exception which can be handled by this catch block.