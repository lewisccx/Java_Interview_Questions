package javapoint;

//Runtime Polymorphism with method
class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike{
    void run(){System.out.println("running safely with 60km");}
    public static void main(String args[]){
        Bike b = new Splendor();//upcasting, down cast trigger runtime error
        b.run();
    }
}
//running safely with 60km.
//In this process, an overridden method is called through the reference variable of a superclass.
//The determination of the method to be called is based on the object being referred to by the reference variable.