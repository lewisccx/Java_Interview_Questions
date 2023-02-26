package inheritance;

// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface one1 {
    public void print_geek();
}

interface two2 {
    public void print_for();
}

interface three3 extends one1, two2 {
    public void print_geek();
}
class child implements three3 {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}
public class MultipleInheritance {
    public static void main(String[] args)
    {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
