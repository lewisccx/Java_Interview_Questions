package basic;

public class FactorialExample {

    public static void main(String args[]){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

//1 = 1 * 1
//2 = 1 * 2
//6 = 2 * 3
//24 = 6 * 4
//120 = 24 * 5