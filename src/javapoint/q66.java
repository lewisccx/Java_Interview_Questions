package javapoint;

class Person
{
    String name,address;
    int age;
    public Person(int age, String name, String address)
    {
        this.age = age;
        this.name = name;
        this.address = address;
        System.out.println("Person is created");
    }
}
class Employee66 extends Person
{
    float salary;
    public Employee66(int age, String name, String address, float salary)
    {

        super(age,name,address);
        this.salary = salary;
        System.out.println("Employee66 is created");
    }
}
class Test66
{
    public static void main (String args[])
    {
        Employee66 e = new Employee66(22, "Mukesh", "Delhi", 90000);
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" javapoint.Address: "+e.address);
    }
}
//    There are the following uses of super keyword.
//
//        super can be used to refer to the immediate parent class instance variable.
//        super can be used to invoke the immediate parent class method.
//        super() can be used to invoke immediate parent class constructor.