package javapoint;

class Person69
{
    public Person69()
    {
        System.out.println("javapoint.Person class constructor called");
    }
}
 class Employee69 extends Person69
{
    public Employee69()
    {
        System.out.println("javapoint.Employee class constructor called");
    }
    public static void main (String args[])
    {
        Employee69 e = new Employee69();
    }
}

//Person class constructor called
//Employee class constructor called

//The super() is implicitly invoked by the compiler if no super() or this() is included explicitly within
//the derived class constructor. Therefore, in this case, The Person class constructor is called first and
//then the Employee class constructor is called.