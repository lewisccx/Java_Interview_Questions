package javapoint;

class Bike91{
    final void run(){System.out.println("running");}
}

class Honda extends Bike91{
    //void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
//Output:Compile Time Error
//final method does not allow override
//If we change any method to a final method, we can't override it. More Details.