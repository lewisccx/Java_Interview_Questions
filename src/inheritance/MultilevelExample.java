package inheritance;


// Java program to illustrate the
// concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_geek()
    {
        System.out.println("one peeks");
    }
}

class two extends one {


    public void print_for() {
        System.out.println("two print for"); }
}

class three extends two {
    public void print_geek()
    {
        super.print_geek();
        System.out.println("three peeks");
    }
}
public class MultilevelExample {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
