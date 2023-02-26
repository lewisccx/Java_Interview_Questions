package inheritance;

// Java program to demonstrate How Diamond Problem
// Is Handled in case of Default Methods

// Interface 1
interface GPI {

    // Default method
    default void show()
    {

        // Print statement
        System.out.println("Default GPI");
    }
}

// Interface 2
// Extending the above interface
interface PI3 extends GPI {
}

// Interface 3
// Extending the above interface
interface PI4 extends GPI {
}

// Main class
// Implementation class code
public class MultiInheritance2 implements PI3, PI4{
    // Main driver method
    public static void main(String args[])
    {

        // Creating object of this class
        // in main() method
        MultiInheritance2 d = new MultiInheritance2();

        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();
    }
}
