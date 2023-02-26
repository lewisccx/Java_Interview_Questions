package javapoint;

class Test70{
    Test70()
    {
//        super();
//        this();
        System.out.println("javapoint.Test class object is created");
    }
    public static void main(String []args){
        Test70 t = new Test70();
    }
}
// Can you use this() and super() both in a constructor?
// No, because this() and super() must be the first statement in the class constructor.