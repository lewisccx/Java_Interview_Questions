package javapoint;

//Runtime Polymorphism by data members
class Bike103{
    int speedlimit=90;
}
class Honda3 extends Bike103 {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike103 obj = new Honda3();
        System.out.println(obj.speedlimit);//90
        System.out.println(obj instanceof Bike103); // true
        System.out.println(obj instanceof Honda3);  // true
    }
}
//output 90

//103) Can you achieve Runtime Polymorphism by data members?
//No, because method overriding is used to achieve runtime polymorphism and data members cannot be overridden.
//We can override the member functions but not the data members. Consider the example given below.