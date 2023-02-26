package javapoint;

class A{
    void msg(){System.out.println("Hello");}
}
class B{
    void msg(){System.out.println("Welcome");}
}
//class C extends javapoint.A,javapoint.B{//suppose if it were
//
//    Public Static void main(String args[]){
//        C obj=new C();
//        obj.msg();//Now which msg() method would be invoked?
//    }
//}
//To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
// Consider a scenario where javapoint.A, javapoint.B, and C are three classes.
// The C class inherits javapoint.A and javapoint.B classes.
// If javapoint.A and javapoint.B classes have the same method and you call it from child class object,
// there will be ambiguity to call the method of javapoint.A or javapoint.B class.

//Since the compile-time errors are better than runtime errors,
// Java renders compile-time error if you inherit 2 classes.
// So whether you have the same method or different, there will be a compile time error.