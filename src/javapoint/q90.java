package javapoint;

class Bike9{
    final int speedlimit=90;//final variable
    void run(){
        //speedlimit=400;
    }
    public static void main(String args[]){
        Bike9 obj=new  Bike9();
        obj.run();
    }
}//end of class
// Output:Compile Time Error
// In Java, the final variable is used to restrict the user from updating it.
// If we initialize the final variable, we can't change its value.
// In other words, we can say that the final variable once assigned to a value,
// can never be changed after that.
// The final variable which is not assigned to any value can only be assigned through the class constructor.
// stop value change
// stop method overriding
// stop inheritance