package javapoint;

class Bike109{
    public void run(){
        System.out.println("running safely");
    };
}
class Honda4 extends Bike109{

    public void run(){System.out.println("running safely");}
    public static void main(String args[]){
        Bike109 obj = new Honda4();
        obj.run();
    }
}
// running safely
// abstractExample method must be implemented
/*
* javapoint.A class that is declared as abstractExample is known as an abstractExample class.
* It needs to be extended and its method implemented. It cannot be instantiated.
* It can have abstractExample methods, non-abstractExample methods, constructors, and static methods.
* It can also have the final methods which will force the subclass not to change the body of the method.
* */