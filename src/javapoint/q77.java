package javapoint;

class OverloadingCalculation3{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String args[]){
        OverloadingCalculation3 obj=new OverloadingCalculation3();
        //obj.sum(20,20);//now ambiguity
        obj.sum(20,(long) 2.0);
        obj.sum((long) 20,2);
    }
}
//javapoint.OverloadingCalculation3.java:7: error: reference to sum is ambiguous
//        obj.sum(20,20);//now ambiguity
//        ^
//        both method sum(int,long) in javapoint.OverloadingCalculation3
//        and method sum(long,int) in javapoint.OverloadingCalculation3 match
//        1 error

//Solution: cast param to long type
//There are two methods defined with the same name, i.e., sum. The first method accepts the integer and long type whereas
//the second method accepts long and the integer type. The parameter passed that are a = 20, b = 20.
//We can not tell that which method will be called as there is no clear differentiation mentioned between
//integer literal and long literal. This is the case of ambiguity. Therefore, the compiler will throw an error.