package javapoint;

class Simple1{
    public static void main(String args[]){
        Simple1 s=new Simple1();
        System.out.println(s instanceof Simple1);//true
    }
}
//true
// The instanceof in Java is also known as type comparison operator because
// it compares the instance with type. It returns either true or false.
// If we apply the instanceof operator with any variable that has a null value,
// it returns false. Consider the following example.