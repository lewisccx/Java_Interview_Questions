package inheritance;
// Java program to demonstrate Multiple Inheritance
// through default methods

// Interface 1
interface PI1 {

    // Default method
    default void show(String str)
    {

        // Print statement if method is called
        // from interface 1
        System.out.println(str);
    }
}

// Interface 2
interface PI2 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 2
        System.out.println("Default PI2");
    }
}
public class MultiInheritance implements PI1,PI2 {
    @Override
    public void show()
    {
        // Using super keyword to call the show
        // method of PI1 interface
        PI1.super.show("Default PI1");//Should not be used directly in the main method;

        // Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI1
    public void showOfPI1() {
        PI1.super.show( "Default PI1");//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI2
    public void showOfPI2() {
        PI2.super.show(); //Should not be used directly in the main method;
    }

    // Mai driver method
    public static void main(String args[])
    {

        // Creating object of this class in main() method
        MultiInheritance d = new MultiInheritance();
        d.show();
        System.out.println("Now Executing showOfPI1() showOfPI2()");
        d.showOfPI1();
        d.showOfPI2();
    }
}
