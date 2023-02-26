package abstractExample;
import java.io.*;
abstract class Demo {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class FirstChild extends Demo {
    public void m1() {
        System.out.println("Inside m1");
    }
}

class SecondChild extends FirstChild {
    public void m2() {
        System.out.println("Inside m2");
    }
    public void m3() {
        System.out.println("Inside m3");
    }
}
public class Abstract3 {
    public static void main(String[] args)
    {
        // if we remove the abstract keyword from FirstChild
        // Class and uncommented below obj creation for
        // FirstChild then it will throw
        // compile time error as did't override all the
        // abstract methods

        // FirstChild f=new FirstChild();
        // f.m1();

        SecondChild s = new SecondChild();
        s.m1();
        s.m2();
        s.m3();
    }
}
//    Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also. From Java 9, it can have private concrete methods as well.
//        Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
//        Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
//        Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
//        Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
//        Multiple implementations: An interface can extend one or more Java interfaces; an abstract class can extend another Java class and implement multiple Java interfaces.
//        Multiple Inheritance:  Interface supports multiple inheritance; an abstract class does not support multiple inheritance.
//        Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.