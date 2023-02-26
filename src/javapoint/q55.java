package javapoint;

class Employee
{
    int id,age;
    String name, address;
    public Employee (int age)
    {
        this.age = age;
    }
    public Employee(int id, int age)
    {
        this(age);
        this.id = id;
    }
    public Employee(int id, int age, String name, String address)
    {
        this(id, age);
        this.name = name;
        this.address = address;
    }
    public static void main (String args[])
    {
        Employee emp = new Employee(105, 22, "Vikas", "Delhi");
        System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address);
    }

}
/*
* sequence of code execution
* line 18 -> line 13 -> line 9 -> line 14 -> line 19 and 20
* */
//As we know, that this refers to the current class object, therefore, it must be similar to the current class object.
// However, there can be two main advantages of passing this into a method instead of the current class object.
// this is a final variable. Therefore, this cannot be assigned to any new value whereas
// the current class object might not be final and can be changed.
// this can be used in the synchronized block.
